package com.example.jetpackcomposecatalogo.composables.animations

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MySizeAnimation() {
    var smallSize by rememberSaveable {
        mutableStateOf(true)
    }
    val size = if (smallSize) 50.dp else 100.dp

    var smallAnimateSize by rememberSaveable {
        mutableStateOf(true)
    }
    val animateSize by animateDpAsState(
        targetValue = if (smallAnimateSize) 50.dp else 100.dp,
        label = "size animation"
    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Box(modifier = Modifier
            .height(size)
            .weight(1F)
            .background(Color.Green)
            .clickable { smallSize = !smallSize }
        )

        Spacer(modifier = Modifier.size(8.dp))

        Box(modifier = Modifier
            .height(animateSize)
            .weight(1F)
            .background(Color.Green)
            .clickable { smallAnimateSize = !smallAnimateSize }
        )
    }

}