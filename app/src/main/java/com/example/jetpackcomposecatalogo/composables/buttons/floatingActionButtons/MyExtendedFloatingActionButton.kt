package com.example.jetpackcomposecatalogo.composables.buttons.floatingActionButtons

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyExtendedFAB() {
    ExtendedFloatingActionButton(onClick = { },
        containerColor = Color.Magenta) {
        Icon(imageVector = Icons.Filled.Create, contentDescription = "Create")
        Spacer(modifier = Modifier.size(4.dp))
        Text(text = "Beautiful button")
    }
}

@Preview
@Composable
fun PreviewMyExtendedFAB() {
    MyExtendedFAB()
}