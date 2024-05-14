package com.example.jetpackcomposecatalogo.composables.buttons

import androidx.compose.material3.OutlinedIconToggleButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyToggleButton() {
    var isChecked by rememberSaveable {
        mutableStateOf(false)
    }

    OutlinedIconToggleButton(
        checked = isChecked, onCheckedChange = { isChecked = !isChecked }) {
        Text(text = "Avanzado")
    }
}

@Preview(showBackground = true)
@Composable
fun MyToggleButtonPreview() {
    MyToggleButton()
}