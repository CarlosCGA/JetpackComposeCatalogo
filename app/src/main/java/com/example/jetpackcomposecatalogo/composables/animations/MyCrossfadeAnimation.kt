package com.example.jetpackcomposecatalogo.composables.animations

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import kotlin.random.Random.Default.nextInt

enum class ComponentType() {
    Image, Text, Box, Error
}

@Composable
fun MyCrossfadeAnimation() {
    var myComponentType: ComponentType by remember {
        mutableStateOf(ComponentType.Image)
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
    ) {
        Button(onClick = { myComponentType = getComponentTypeRandom() }) {
            Text(text = "Toggle component")
        }

        Crossfade(targetState = myComponentType) {myComponentType ->
            when (myComponentType) {
                ComponentType.Image -> Icon(Icons.Filled.Home, contentDescription = "icon")
                ComponentType.Text -> Text(text = "I am a text")
                ComponentType.Box -> Box(
                    modifier = Modifier
                        .size(150.dp)
                        .background(Color.Red)
                )

                ComponentType.Error -> Text(
                    text = "Error",
                    color = Color.Red,
                    fontStyle = FontStyle.Italic
                )
            }
        }

    }

}

fun getComponentTypeRandom(): ComponentType {
    return when (nextInt(from = 0, until = 3)) {
        0 -> ComponentType.Image
        1 -> ComponentType.Text
        2 -> ComponentType.Box
        else -> ComponentType.Error
    }
}