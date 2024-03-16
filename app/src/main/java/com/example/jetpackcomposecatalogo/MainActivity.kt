package com.example.jetpackcomposecatalogo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecatalogo.composables.MyArrangementColumn
import com.example.jetpackcomposecatalogo.composables.MyArrangementRow
import com.example.jetpackcomposecatalogo.composables.MyBalancedColumn
import com.example.jetpackcomposecatalogo.composables.MyBox
import com.example.jetpackcomposecatalogo.composables.MyComplexLayout
import com.example.jetpackcomposecatalogo.composables.MyConstraintLayout
import com.example.jetpackcomposecatalogo.composables.MyConstraintLayoutBarrier
import com.example.jetpackcomposecatalogo.composables.MyConstraintLayoutChain
import com.example.jetpackcomposecatalogo.composables.MyConstraintLayoutGuideline
import com.example.jetpackcomposecatalogo.composables.MyScrollableRow
import com.example.jetpackcomposecatalogo.composables.MyText
import com.example.jetpackcomposecatalogo.composables.MyTextField
import com.example.jetpackcomposecatalogo.composables.MyWeightRow
import com.example.jetpackcomposecatalogo.exercises.FirstExercise
import com.example.jetpackcomposecatalogo.exercises.SecondExercise
import com.example.jetpackcomposecatalogo.ui.theme.JetpackComposeCatalogoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeCatalogoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState()),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        MyDivider(title = "MyBox")
                        MyBox()

                        MyDivider(title = "MyBalancedColumn")
                        MyBalancedColumn()

                        MyDivider(title = "MyArrangementColumn")
                        MyArrangementColumn()

                        //MyDivider(title = "MyScrollableColumn")
                        //MyScrollableColumn()

                        MyDivider(title = "MyArrangementRow")
                        MyArrangementRow()

                        MyDivider(title = "MyScrollableRow")
                        MyScrollableRow()

                        MyDivider(title = "MyWeightRow")
                        MyWeightRow()

                        MyDivider(title = "MyComplexLayout")
                        MyComplexLayout()

                        MyDivider(title = "FirstExercise")
                        FirstExercise()

                        MyDivider(title = "MyConstraintLayout")
                        MyConstraintLayout()

                        MyDivider(title = "SecondExercise")
                        SecondExercise()

                        MyDivider(title = "MyConstraintLayoutGuideline")
                        MyConstraintLayoutGuideline()

                        MyDivider(title = "MyConstraintLayoutBarrier")
                        MyConstraintLayoutBarrier()

                        MyDivider(title = "MyConstraintLayoutChain")
                        MyConstraintLayoutChain()

                        MyDivider(title = "MyFirstState")
                        MyFirstState()

                        MyDivider(title = "MyText")
                        MyText()

                        MyDivider(title = "MyTextField")
                        MyTextField()
                    }
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

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MyDivider(title: String) {
    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        MySpacer(height = 15.dp, width = 0.dp)
        HorizontalDivider(color = Color.Gray, thickness = 1.dp)
        Text(modifier = Modifier.basicMarquee(), maxLines = 1, text = title)
        HorizontalDivider(color = Color.Gray, thickness = 1.dp)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewMain() {
    JetpackComposeCatalogoTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            color = MaterialTheme.colorScheme.background
        ) {
            Column {
                MyDivider(title = "MyBox")
                MyBox()

                MyDivider(title = "MyBalancedColumn")
                MyBalancedColumn()

                MyDivider(title = "MyArrangementColumn")
                MyArrangementColumn()

                //MyDivider(title = "MyScrollableColumn")
                //MyScrollableColumn()

                MyDivider(title = "MyArrangementRow")
                MyArrangementRow()

                MyDivider(title = "MyScrollableRow")
                MyScrollableRow()

                MyDivider(title = "MyWeightRow")
                MyWeightRow()

                MyDivider(title = "MyComplexLayout")
                MyComplexLayout()

                MyDivider(title = "FirstExercise")
                FirstExercise()

                MyDivider(title = "MyConstraintLayout")
                MyConstraintLayout()

                MyDivider(title = "SecondExercise")
                SecondExercise()

                MyDivider(title = "MyConstraintLayoutGuideline")
                MyConstraintLayoutGuideline()

                MyDivider(title = "MyConstraintLayoutBarrier")
                MyConstraintLayoutBarrier()

                MyDivider(title = "MyConstraintLayoutChain")
                MyConstraintLayoutChain()

                MyDivider(title = "MyFirstState")
                MyFirstState()

                MyDivider(title = "MyText")
                MyText()

                MyDivider(title = "MyTextField")
                MyTextField()
            }
        }
    }
}