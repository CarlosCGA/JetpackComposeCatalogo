package com.example.jetpackcomposecatalogo.composables

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
import androidx.compose.ui.unit.dp

/** COMBINED LAYOUTS **/

@Composable
fun MyComplexLayout() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1F)
                .background(Color.Cyan)
        ) {

        }

        MySpacer(
            height = 30.dp,
            width = 50.dp
        ) //In this case width size does not matter, because the composable over this have "fillMaxWidth"

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1F)
        ) {
            Box(
                modifier = Modifier
                    .weight(1F)
                    .fillMaxHeight()
                    .background(Color.Red),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Hola, soy Carlos :)")
            }
            Box(
                modifier = Modifier
                    .weight(1F)
                    .fillMaxHeight()
                    .background(Color.Green)
            )
        }

        MySpacer(
            height = 30.dp,
            width = 50.dp
        ) //In this case width size does not matter, because the composable over this have "fillMaxWidth"

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1F)
                .background(Color.Cyan)
        ) {

        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewMyComplexLayout() {
    MyComplexLayout()
}

/**************************************************************************************************/