package com.example.jetpackcomposecatalogo.composables.texts

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MyText() {
    Column(Modifier.fillMaxSize()) {
        Text(text = "Texto de ejemplo")
        Text(text = "Texto de ejemplo de gran tamaño", fontSize = 22.sp)
        Text(text = "Texto de ejemplo rojo", color = Color.Red)
        Text(text = "Texto de ejemplo super ligera", fontWeight = FontWeight.ExtraLight)
        Text(text = "Texto de ejemplo super negrita", fontWeight = FontWeight.ExtraBold)
        Text(
            text = "Texto de ejemplo con la tipografía Monospace",
            fontFamily = FontFamily.Monospace
        )
        Text(
            text = "Texto de ejemplo justificado que contiene mucho texto y se muestra en muchas líneas, ya que es el funcionamiento habitual y por defecto del sistema :)",
            textAlign = TextAlign.Justify
        )
        Text(
            modifier = Modifier.basicMarquee(),
            text = "Texto de ejemplo con marquee, esto hace que de vueltas como un carousel ya que contiene mucho texto y se deberia mostrar en muchas líneas, ya que sería el funcionamiento habitual y por defecto del sistema, pero de esta forma hace virguerias :)"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMyText() {
    MyText()
}