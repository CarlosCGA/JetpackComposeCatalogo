package com.example.jetpackcomposecatalogo.composables.animations

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyVisibilityAnimation() {
    var isVisible by rememberSaveable {
        mutableStateOf(true)
    }

    var isVisibleAnimate by rememberSaveable {
        mutableStateOf(true)
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {

        Column(
            modifier = Modifier
                .weight(1F),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = { isVisible = !isVisible }) {
                Text(text = "Toggle visibility")
            }
            Spacer(modifier = Modifier.size(8.dp))
            if (isVisible) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .background(Color.Cyan)
                )
            }
        }

        Spacer(modifier = Modifier.size(8.dp))

        Column(
            modifier = Modifier
                .weight(1F),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = { isVisibleAnimate = !isVisibleAnimate }) {
                Text(text = "Toggle visibility")
            }
            Spacer(modifier = Modifier.size(8.dp))
            AnimatedVisibility(visible = isVisibleAnimate) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .background(Color.Cyan)
                )

            }
        }

    }
}