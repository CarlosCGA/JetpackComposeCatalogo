package com.example.jetpackcomposecatalogo.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyRadioButton() {
    Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        RadioButton(
            selected = false, onClick = {}, colors = RadioButtonDefaults.colors(
                selectedColor = Color.Red,
                unselectedColor = Color.Yellow,
                disabledSelectedColor = Color.Green
            )
        )
        Text(text = "MyRadioButton")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMyRadioButton() {
    MyRadioButton()
}

@Composable
fun MyRadioButtonList() {
    var selected by remember {
        mutableStateOf("Carlos")
    }

    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = selected == "Carlos", onClick = { selected = "Carlos" })
            Text(text = "Carlos")
        }

        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = selected == "Roberto", onClick = { selected = "Roberto" })
            Text(text = "Roberto")
        }

        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = selected == "Jesús", onClick = { selected = "Jesús" })
            Text(text = "Jesús")
        }

        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = selected == "Guillermo", onClick = {selected = "Guillermo" })
            Text(text = "Guillermo")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMyRadioButtonList() {
    MyRadioButtonList()
}

@Composable
fun MyRadioButtonListPro(name: String, onItemSelected: (String) -> Unit) {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = name == "Carlos", onClick = { onItemSelected("Carlos") })
            Text(text = "Carlos")
        }

        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = name == "Roberto", onClick = { onItemSelected("Roberto") })
            Text(text = "Roberto")
        }

        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = name == "Jesús", onClick = { onItemSelected("Jesús") })
            Text(text = "Jesús")
        }

        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = name == "Guillermo", onClick = { onItemSelected("Guillermo") })
            Text(text = "Guillermo")
        }
    }
}
