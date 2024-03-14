package com.example.jetpackcomposecatalogo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecatalogo.ui.theme.JetpackComposeCatalogoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeCatalogoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyBox()
                }
            }
        }
    }
}

/** BOX **/

@Composable
fun MyBox() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .height(200.dp)
                .width(200.dp)
                .background(Color.Red)
                .verticalScroll(
                    rememberScrollState()
                ),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(
                text = "Texto de ejemplo",
            )
        }
    }
}


@Preview(showBackground = true, device = Devices.PIXEL_4_XL)
@Composable
fun PreviewMyBox() {
    JetpackComposeCatalogoTheme {
        MyBox()
    }
}

/**************************************************************************************************/


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


/** ROW **/

@Composable
fun MyArrangementRow() {
    Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceEvenly) {
        Text(text = "Ejemplo1")
        Text(text = "Ejemplo2")
        Text(text = "Ejemplo3")
        Text(text = "Ejemplo4")
    }
}

@Composable
fun MyScrollableRow() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .horizontalScroll(rememberScrollState()),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Ejemplo1", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo2", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo3", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo4", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo1", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo2", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo3", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo4", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo1", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo2", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo3", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo4", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo1", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo2", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo3", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo4", modifier = Modifier.width(100.dp))
    }
}

@Composable
fun MyWeightRow() {
    Row(modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.Bottom) {
        Text(text = "Ejemplo1", modifier = Modifier.weight(1F))
        Text(text = "Ejemplo2", modifier = Modifier.weight(1F))
        Text(text = "Ejemplo3", modifier = Modifier.weight(1F))
        Text(text = "Ejemplo4", modifier = Modifier.weight(1F))
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewMyRow() {
    MyArrangementRow()
    MyWeightRow()
    MyScrollableRow()
}

/**************************************************************************************************/


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