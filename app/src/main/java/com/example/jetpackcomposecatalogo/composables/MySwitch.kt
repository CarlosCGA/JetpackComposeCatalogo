package com.example.jetpackcomposecatalogo.composables

import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MySwitch() {
    var state by rememberSaveable {
        mutableStateOf(true)
    }

    Switch(
        checked = state, onCheckedChange = { newState -> state = newState },
        colors = SwitchDefaults.colors(
            checkedThumbColor = Color.Yellow,
            checkedTrackColor = Color.Red,
            uncheckedThumbColor = Color.Magenta,
            uncheckedTrackColor = Color.Gray,
            checkedBorderColor = Color.Yellow
        )
    )
}


@Preview(showBackground = true)
@Composable
fun PreviewMySwitch() {
    MySwitch()
}