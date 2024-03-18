package com.example.jetpackcomposecatalogo.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyTextField(name: String, onValueChange: (String) -> Unit, label: String) {
    Column(Modifier.fillMaxSize()) {
        TextField(
            value = name, onValueChange = onValueChange,
            label = { Text(text = label)}
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMyTextField() {
    var inputText by remember { mutableStateOf(""/*"Default value (mainly empty)"*/) }
    MyTextField(inputText, { newText -> inputText = newText }, "Name")
}