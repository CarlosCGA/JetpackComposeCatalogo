package com.example.jetpackcomposecatalogo.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyCheckBox() {
    var state by rememberSaveable {
        mutableStateOf(true)
    }

    Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
        Checkbox(
            checked = state, onCheckedChange = { newState -> state = newState },
        )
        Text(text = "My checkbox")
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewMyCheckBox() {
    MyCheckBox()
}