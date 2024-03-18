package com.example.jetpackcomposecatalogo.composables

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyButton(context: Context) {
    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Button(onClick = { Toast.makeText(context, "Button clicked!", Toast.LENGTH_SHORT).show() }) {
            Text(text = "Click me!")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewMyButton() {
    MyButton(context = LocalContext.current)
}