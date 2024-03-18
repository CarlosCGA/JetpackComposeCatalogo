package com.example.jetpackcomposecatalogo.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecatalogo.MySpacer

const val UPDATE_PROGRESS_PERCENT = 0.05F

@Composable
fun MyProgressBar() {
    var isMoreProgressEnabled by rememberSaveable {
        mutableStateOf(true)
    }

    var isLessProgressEnabled by rememberSaveable {
        mutableStateOf(false)
    }

    var progress by rememberSaveable {
        mutableFloatStateOf(0F)
    }

    Column(
        Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CircularProgressIndicator(
            progress = { progress },
            color = Color.Red,
            strokeWidth = 8.dp,
        )
        LinearProgressIndicator(
            progress = { progress },
            modifier = Modifier.padding(top = 16.dp),
            color = Color.Yellow,
            trackColor = Color.Blue,
        )

        Row(
            Modifier
                .fillMaxWidth()
                .padding(top = 16.dp), horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = {
                    if (progress > 0)
                        progress -= UPDATE_PROGRESS_PERCENT

                    if(progress <= 0)
                        isLessProgressEnabled = false

                    isMoreProgressEnabled = true
                },
                enabled = isLessProgressEnabled
            ) {
                Text(text = "Less progress!")
            }

            MySpacer(height = 16.dp, width = 16.dp)

            Button(
                onClick = {
                    if (progress < 1)
                        progress += UPDATE_PROGRESS_PERCENT

                    if(progress >= 1)
                        isMoreProgressEnabled = false

                    isLessProgressEnabled = true
                },
                enabled = isMoreProgressEnabled
            ) {
                Text(text = "More progress!")
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMyProgressBar() {
    MyProgressBar()
}