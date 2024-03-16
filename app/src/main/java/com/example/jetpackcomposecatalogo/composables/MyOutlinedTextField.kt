package com.example.jetpackcomposecatalogo.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyOutlinedTextField() {
    var myText by remember {
        mutableStateOf("")
    }
    Column {
        OutlinedTextField(
            value = myText, onValueChange = { newText -> myText = newText },
            Modifier.padding(24.dp),
            label = { Text(text = "Este es mi OutlinedTextField") },

        )

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMyOutlinedTextField() {
    MyOutlinedTextField()
}