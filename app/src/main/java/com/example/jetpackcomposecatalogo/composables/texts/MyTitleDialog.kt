package com.example.jetpackcomposecatalogo.composables.texts

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyTitleDialog(text: String) {
    Text(
        modifier = Modifier.padding(vertical = 8.dp),
        text = text,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    )
}