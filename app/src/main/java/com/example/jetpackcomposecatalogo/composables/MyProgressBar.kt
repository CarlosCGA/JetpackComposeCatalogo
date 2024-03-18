package com.example.jetpackcomposecatalogo.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyProgressBar() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CircularProgressIndicator(color = Color.Red, strokeWidth = 8.dp)
        LinearProgressIndicator(
            modifier = Modifier.padding(top = 16.dp),
            color = Color.Yellow,
            trackColor = Color.Blue
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMyProgressBar() {
    MyProgressBar()
}