package com.example.jetpackcomposecatalogo.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyBadgeBox() {
    BadgedBox(modifier = Modifier.padding(16.dp),
        badge = {
            Text(
                modifier = Modifier
                    .background(Color.Red),
                fontSize = 8.sp,
                text = "100"
            )
        }
    ) {
        Icon(Icons.Default.Star, contentDescription = "")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMyBadgeBox() {
    MyBadgeBox()
}