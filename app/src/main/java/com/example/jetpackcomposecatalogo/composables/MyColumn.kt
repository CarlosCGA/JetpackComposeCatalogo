package com.example.jetpackcomposecatalogo.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecatalogo.ui.theme.JetpackComposeCatalogoTheme

/** COLUMN **/

@Composable
fun MyBalancedColumn() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            "Ejemplo1", modifier = Modifier
                .background(Color.Red)
                .weight(1f)
        )
        Text(
            "Ejemplo2", modifier = Modifier
                .background(Color.Yellow)
                .weight(1f)
        )
        Text(
            "Ejemplo3", modifier = Modifier
                .background(Color.Green)
                .weight(1f)
        )
        Text(
            "Ejemplo4", modifier = Modifier
                .background(Color.Cyan)
                .weight(1f)
        )
    }

}

@Composable
fun MyArrangementColumn() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Ejemplo1", modifier = Modifier.background(Color.Red))
        Text("Ejemplo2", modifier = Modifier.background(Color.Yellow))
        Text("Ejemplo3", modifier = Modifier.background(Color.Green))
        Text("Ejemplo4", modifier = Modifier.background(Color.Cyan))
    }
}

@Composable
fun MyScrollableColumn() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.End
    ) {
        Text(
            "Ejemplo1", modifier = Modifier
                .background(Color.Red)
                .height(100.dp)
        )
        Text(
            "Ejemplo2", modifier = Modifier
                .background(Color.Yellow)
                .height(100.dp)
        )
        Text(
            "Ejemplo3", modifier = Modifier
                .background(Color.Green)
                .height(100.dp)
        )
        Text(
            "Ejemplo4", modifier = Modifier
                .background(Color.Cyan)
                .height(100.dp)
        )
        Text(
            "Ejemplo1", modifier = Modifier
                .background(Color.Red)
                .height(100.dp)
        )
        Text(
            "Ejemplo2", modifier = Modifier
                .background(Color.Yellow)
                .height(100.dp)
        )
        Text(
            "Ejemplo3", modifier = Modifier
                .background(Color.Green)
                .height(100.dp)
        )
        Text(
            "Ejemplo4", modifier = Modifier
                .background(Color.Cyan)
                .height(100.dp)
        )
        Text(
            "Ejemplo1", modifier = Modifier
                .background(Color.Red)
                .height(100.dp)
        )
        Text(
            "Ejemplo2", modifier = Modifier
                .background(Color.Yellow)
                .height(100.dp)
        )
        Text(
            "Ejemplo3", modifier = Modifier
                .background(Color.Green)
                .height(100.dp)
        )
        Text(
            "Ejemplo4", modifier = Modifier
                .background(Color.Cyan)
                .height(100.dp)
        )
        Text(
            "Ejemplo1", modifier = Modifier
                .background(Color.Red)
                .height(100.dp)
        )
        Text(
            "Ejemplo2", modifier = Modifier
                .background(Color.Yellow)
                .height(100.dp)
        )
        Text(
            "Ejemplo3", modifier = Modifier
                .background(Color.Green)
                .height(100.dp)
        )
        Text(
            "Ejemplo4", modifier = Modifier
                .background(Color.Cyan)
                .height(100.dp)
        )
        Text(
            "Ejemplo1", modifier = Modifier
                .background(Color.Red)
                .height(100.dp)
        )
        Text(
            "Ejemplo2", modifier = Modifier
                .background(Color.Yellow)
                .height(100.dp)
        )
        Text(
            "Ejemplo3", modifier = Modifier
                .background(Color.Green)
                .height(100.dp)
        )
        Text(
            "Ejemplo4", modifier = Modifier
                .background(Color.Cyan)
                .height(100.dp)
        )
        Text(
            "Ejemplo1", modifier = Modifier
                .background(Color.Red)
                .height(100.dp)
        )
        Text(
            "Ejemplo2", modifier = Modifier
                .background(Color.Yellow)
                .height(100.dp)
        )
        Text(
            "Ejemplo3", modifier = Modifier
                .background(Color.Green)
                .height(100.dp)
        )
        Text(
            "Ejemplo4", modifier = Modifier
                .background(Color.Cyan)
                .height(100.dp)
        )
    }
}


@Preview(showBackground = true, device = Devices.PIXEL_4_XL)
@Composable
fun PreviewMyColumn() {
    JetpackComposeCatalogoTheme {
        MyBalancedColumn()
        MyArrangementColumn()
        MyScrollableColumn() //Can scroll because is the last component (other components have "fillMaxSize"). So if this component was not the last it can not be possible to scroll
    }
}

/**************************************************************************************************/