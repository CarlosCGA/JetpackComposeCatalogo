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
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.unit.Dp
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
                    MyComplexLayout()
                }
            }
        }
    }
}

/** SPACER **/

@Composable
fun MySpacer(height: Dp, width: Dp) {
    Spacer(
        modifier = Modifier
            .height(height)
            .width(width)
    )
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