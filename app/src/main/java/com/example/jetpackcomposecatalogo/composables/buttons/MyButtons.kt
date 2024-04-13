package com.example.jetpackcomposecatalogo.composables.buttons

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyButtons() {
    Row(
        modifier = Modifier.horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(onClick = { }) {
            Text(text = "firstButton")
        }

        Spacer(modifier = Modifier.size(8.dp))

        ElevatedButton(onClick = { }) {
            Text(text = "secondButton")
        }

        Spacer(modifier = Modifier.size(8.dp))

        FilledTonalButton(onClick = { }) {
            Text(text = "thirdButton")
        }
    }
}

@Preview
@Composable
fun PreviewMyButtons() {
    MyButtons()
}