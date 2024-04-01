package com.example.jetpackcomposecatalogo.composables.dialogs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties

@Composable
fun MySimpleCustomDialog(show: Boolean, onDismiss: () -> Unit) {

    if (show) {

        Dialog(
            onDismissRequest = { onDismiss.invoke() },
            properties = DialogProperties(
                dismissOnBackPress = false,
                dismissOnClickOutside = true
            ),
            content = {
                Column(
                    modifier = Modifier
                        .background(Color.White)
                        .padding(24.dp)
                        .fillMaxWidth()
                ) {
                    Text(text = "I am an example")
                    Text(text = "I am a simple custom dialog")
                    Button(onClick = {}) {
                        Text(text = "My job is do anything")
                    }
                }
            }
        )
    }
}

@Preview
@Composable
fun PreviewMySimpleCustomDialog() {
    var show by remember {
        mutableStateOf(false)
    }
    MySimpleCustomDialog(show) { show = false }
}