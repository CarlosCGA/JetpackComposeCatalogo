package com.example.jetpackcomposecatalogo.exercises

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FirstExercise() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1F)
                .background(Color.Cyan), contentAlignment = Alignment.Center
        ) {
            Text(text = "Ejemplo 1")
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1F)) {
            Box(
                modifier = Modifier
                    .weight(1F)
                    .background(Color.Red)
                    .fillMaxHeight(),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Ejemplo 2")
            }

            Box(
                modifier = Modifier
                    .weight(1F)
                    .background(Color.Green)
                    .fillMaxHeight(),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Ejemplo 3")
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1F)
                .background(Color.Magenta), contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Ejemplo 4")
        }
    }
}

@Preview
@Composable
fun PreviewFirstExercise() {
    FirstExercise()
}