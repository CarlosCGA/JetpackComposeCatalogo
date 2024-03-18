package com.example.jetpackcomposecatalogo.composables

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyIcon() {
    Icon(
        imageVector = Icons.Rounded.Star,
        contentDescription = "Star icon",
        tint = Color.Red
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewMyIcon() {
    MyIcon()
}