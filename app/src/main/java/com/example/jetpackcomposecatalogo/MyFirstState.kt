package com.example.jetpackcomposecatalogo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyFirstState() {
    //As remember var we can use remember or rememberSaveable
    //but remember will die when lifecycle kills her
    var counter by rememberSaveable { mutableIntStateOf(0) }

    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { counter += 1 }) {
            Text(text = "Pulsame :)")
        }
        Text(text = "Has pulsado el botón $counter veces")
    }


}

@Preview(showBackground = true)
@Composable
fun PreviewMyFirstState() {
    MyFirstState()
}