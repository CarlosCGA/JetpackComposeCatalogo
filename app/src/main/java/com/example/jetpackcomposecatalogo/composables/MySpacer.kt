package com.example.jetpackcomposecatalogo.composables

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
fun MySpacer(height: Dp, width: Dp) {
    Spacer(
        modifier = Modifier
            .height(height)
            .width(width)
    )
}