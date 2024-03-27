package com.example.jetpackcomposecatalogo.composables

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MyDivider(title: String) {
    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        MySpacer(height = 15.dp, width = 0.dp)
        HorizontalDivider(color = Color.Gray, thickness = 1.dp)
        Text(modifier = Modifier.basicMarquee(), maxLines = 1, text = title)
        HorizontalDivider(color = Color.Gray, thickness = 1.dp)
    }
}