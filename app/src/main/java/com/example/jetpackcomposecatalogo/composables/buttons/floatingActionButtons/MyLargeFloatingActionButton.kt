package com.example.jetpackcomposecatalogo.composables.buttons.floatingActionButtons

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyLargeFAB() {
    LargeFloatingActionButton(onClick = { }, containerColor = Color.Green) {
        Icon(imageVector = Icons.Filled.Search, contentDescription = "Search")
    }
}

@Preview
@Composable
fun PreviewMyLargeFAB() {
    MyLargeFAB()
}