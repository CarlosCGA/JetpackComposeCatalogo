package com.example.jetpackcomposecatalogo.composables.buttons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyTextButton() {
    var isEnabled by rememberSaveable {
        mutableStateOf(true)
    }
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextButton(onClick = {
            isEnabled = false
        },
            colors = ButtonColors(
                containerColor = Color.Blue,
                contentColor = Color.Magenta,
                disabledContainerColor = Color.Gray,
                disabledContentColor = Color.Magenta
            ),
            enabled = isEnabled
        ) {
            Text(text = "Click me, I am a TextButton!")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewMyTextButton() {
    MyTextButton()
}