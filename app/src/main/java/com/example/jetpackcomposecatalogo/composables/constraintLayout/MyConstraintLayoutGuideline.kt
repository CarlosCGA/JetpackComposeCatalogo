package com.example.jetpackcomposecatalogo.composables.constraintLayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun MyConstraintLayoutGuideline() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {

        val boxRed = createRef()

        //Se pueden colocar por porcentaje (mas util) o por dp
        val topGuideline = createGuidelineFromTop(0.1F)
        val startGuideline = createGuidelineFromStart(0.25F)

        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Red)
            .constrainAs(boxRed) {
                top.linkTo(topGuideline)
                start.linkTo(startGuideline)
            })
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMyConstraintLayoutGuideline() {
    MyConstraintLayoutGuideline()
}