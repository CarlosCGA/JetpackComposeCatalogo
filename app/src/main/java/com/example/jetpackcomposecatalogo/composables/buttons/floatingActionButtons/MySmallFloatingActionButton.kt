package com.example.jetpackcomposecatalogo.composables.buttons.floatingActionButtons

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MySmallFAB() {
    SmallFloatingActionButton(onClick = { }, containerColor = Color.Yellow) {
        Icon(imageVector = Icons.Filled.Check, contentDescription = "Check")
    }
}

@Preview
@Composable
fun PreviewMySmallFAB() {
    MySmallFAB()
}