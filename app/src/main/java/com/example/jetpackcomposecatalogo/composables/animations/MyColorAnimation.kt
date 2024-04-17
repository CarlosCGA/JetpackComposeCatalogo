package com.example.jetpackcomposecatalogo.composables.animations

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
fun MyColorAnimation() {
    var firstColor by rememberSaveable {
        mutableStateOf(false)
    }
    val realColor = if (firstColor) Color.Red else Color.Yellow

    var firstAnimateColor by rememberSaveable {
        mutableStateOf(false)
    }

    val animateRealColor by animateColorAsState(
        targetValue = if (firstAnimateColor) Color.Red else Color.Yellow,
        label = "color animation"
    )

    Row(modifier = Modifier
        .fillMaxWidth()
        .height(100.dp)
    ) {
        Box(modifier = Modifier
            .fillMaxHeight()
            .weight(1F)
            .background(realColor)
            .clickable { firstColor = !firstColor }
        )

        Spacer(modifier = Modifier.size(8.dp))

        Box(modifier = Modifier
            .fillMaxHeight()
            .weight(1F)
            .background(animateRealColor)
            .clickable { firstAnimateColor = !firstAnimateColor }
        )
    }

}