package com.example.jetpackcomposecatalogo.composables.animations

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.coroutines.cancellation.CancellationException

@Preview
@Composable
fun MyOnPressAnimation() {
    var smallAnimateSize by rememberSaveable {
        mutableStateOf(false)
    }
    val animateSize by animateDpAsState(
        targetValue = if (smallAnimateSize) 50.dp else 100.dp,
        label = "size animation"
    )


    Box(modifier = Modifier
        .size(animateSize)
        .background(Color.Red)
        .pointerInput(Unit) {
            detectTapGestures(
                onPress = {
                    //start
                    smallAnimateSize = true

                    val released = try {
                        tryAwaitRelease()
                    } catch (c: CancellationException) {
                        false
                    }
                    smallAnimateSize = if (released) {
                        //ACTION_UP
                        false
                    } else {
                        //CANCELED
                        false
                    }
                }
            )
        }
    )
}