package com.example.jetpackcomposecatalogo.composables

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MyTextField() {
    Column(Modifier.fillMaxSize()) {
        var inputText by remember { mutableStateOf("Default value") }
        TextField(value =inputText, onValueChange ={ newText -> inputText = newText})
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMyTextField() {
    MyTextField()
}