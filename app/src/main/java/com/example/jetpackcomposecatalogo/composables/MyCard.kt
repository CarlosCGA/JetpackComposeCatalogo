package com.example.jetpackcomposecatalogo.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyCard() {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 12.dp,
        ),
        shape = MaterialTheme.shapes.extraLarge,
        border = BorderStroke(5.dp, Color.Red),
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Ejemplo 1")
            Text(text = "Ejemplo 2")
            Text(text = "Ejemplo 3")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMyCard() {
    MyCard()
}