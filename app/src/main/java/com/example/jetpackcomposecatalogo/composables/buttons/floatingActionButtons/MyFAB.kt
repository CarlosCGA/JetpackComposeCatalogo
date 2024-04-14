package com.example.jetpackcomposecatalogo.composables.buttons.floatingActionButtons

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyFAB() {
    //Material FAB update parameter "backgroundColor" to "containerColor" in Material 3
    FloatingActionButton(onClick = { }, containerColor = Color.Red) {
        Icon(imageVector = Icons.Filled.Add, contentDescription = "Add")
    }
}

@Preview
@Composable
fun PreviewMyFAB() {
    MyFAB()
}