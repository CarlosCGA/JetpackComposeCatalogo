package com.example.jetpackcomposecatalogo.composables.dialogs

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyDialog(show: Boolean, onDismiss: () -> Unit, onConfirm: () -> Unit) {

    if (show) {
        AlertDialog(
            onDismissRequest = {},
            confirmButton = {
                TextButton(onClick = { onConfirm.invoke() }) {
                    Text(text = "Confirm button")
                }
            },
            dismissButton = {
                TextButton(onClick = { onDismiss.invoke() }) {
                    Text(text = "Dismiss button")
                }
            },
            title = { Text(text = "Title") },
            text = { Text(text = "Hi! I am dialog description") })
    }
}

@Preview
@Composable
fun PreviewMyDialog() {
    var show by remember {
        mutableStateOf(false)
    }
    MyDialog(show, {show = false}, {show = false})
}