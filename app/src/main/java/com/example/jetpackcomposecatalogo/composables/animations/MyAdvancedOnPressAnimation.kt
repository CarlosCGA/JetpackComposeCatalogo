package com.example.jetpackcomposecatalogo.composables.animations

import androidx.compose.animation.core.animate
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlin.coroutines.cancellation.CancellationException


const val DEFAULT_SIZE = 100F
const val PRESS_SIZE = (DEFAULT_SIZE - (DEFAULT_SIZE*0.15)).toFloat()
const val DELTA_1 = (DEFAULT_SIZE*0.075).toFloat()
const val DELTA_2 = (DEFAULT_SIZE*0.05).toFloat()
const val DELTA_3 = (DEFAULT_SIZE*0.025).toFloat()

const val DURATION = 100

@Preview
@Composable
fun MyAdvancedOnPressAnimation() {

    var targetSize by rememberSaveable {
        mutableFloatStateOf(DEFAULT_SIZE)
    }
    val size = animateFloatAsState(targetValue = targetSize, label = "animate size")

    val animationRoutine = rememberCoroutineScope()

    Box(modifier = Modifier
        .size(size.value.dp)
        .background(Color.Red)
        .pointerInput(Unit) {
            detectTapGestures(
                onPress = {
                    //start "onPress"
                    animateSmallWithBounce(animationRoutine) { targetSize = it }()

                    val released = try {
                        tryAwaitRelease()
                    } catch (c: CancellationException) {
                        false
                    }

                    animateBigWithBounce(animationRoutine) { targetSize = it }()
                    if (released) {
                        //ACTION_UP
                    } else {
                        //CANCELED
                    }
                }
            )
        }
    )

}

suspend fun animateSmallWithBounce(
    animationRoutine: CoroutineScope,
    onNewSize: (Float) -> Unit
): () -> Unit {
    return {
        animationRoutine.launch {
            coroutineScope {
                launch {
                    animate(
                        DEFAULT_SIZE,
                        PRESS_SIZE - DELTA_1,
                        animationSpec = tween(DURATION),
                        block = { value, _ -> onNewSize(value) }
                    )
                    animate(
                        PRESS_SIZE - DELTA_1,
                        PRESS_SIZE + DELTA_2,
                        animationSpec = tween(DURATION),
                        block = { value, _ -> onNewSize(value) }
                    )
                    animate(
                        PRESS_SIZE + DELTA_2,
                        PRESS_SIZE - DELTA_3,
                        animationSpec = tween(DURATION),
                        block = { value, _ -> onNewSize(value) }
                    )
                    animate(
                        PRESS_SIZE - DELTA_3,
                        PRESS_SIZE,
                        animationSpec = tween(DURATION),
                        block = { value, _ -> onNewSize(value) }
                    )
                }
            }
        }
    }
}

suspend fun animateBigWithBounce(
    animationRoutine: CoroutineScope,
    onNewSize: (Float) -> Unit
): () -> Unit {
    return {
        animationRoutine.launch {
            coroutineScope {
                launch {
                    animate(
                        PRESS_SIZE,
                        DEFAULT_SIZE + DELTA_1,
                        animationSpec = tween(DURATION),
                        block = { value, _ -> onNewSize(value) }
                    )
                    animate(
                        DEFAULT_SIZE + DELTA_1,
                        DEFAULT_SIZE - DELTA_2,
                        animationSpec = tween(DURATION),
                        block = { value, _ -> onNewSize(value) }
                    )
                    animate(
                        DEFAULT_SIZE - DELTA_2,
                        DEFAULT_SIZE + DELTA_3,
                        animationSpec = tween(DURATION),
                        block = { value, _ -> onNewSize(value) }
                    )
                    animate(
                        DEFAULT_SIZE + DELTA_3,
                        DEFAULT_SIZE,
                        animationSpec = tween(DURATION),
                        block = { value, _ -> onNewSize(value) }
                    )
                }
            }
        }
    }
}