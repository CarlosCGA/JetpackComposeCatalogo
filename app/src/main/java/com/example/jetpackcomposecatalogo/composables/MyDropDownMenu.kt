package com.example.jetpackcomposecatalogo.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.MenuItemColors
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyDropDownMenu(list: List<String>) {
    var itemSelected by rememberSaveable {
        mutableStateOf(list[0])
    }
    var expanded by rememberSaveable {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        OutlinedButton(
            modifier = Modifier
                .fillMaxWidth(),
            onClick = { expanded = true }
        ) {
            Text(text = itemSelected)
        }

        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            list.map { item ->
                DropdownMenuItem(
                    text = { Text(text = item) },
                    onClick = {
                        itemSelected = item
                        expanded = false
                    },
                    colors = MenuItemColors(
                        textColor = Color.Red,
                        leadingIconColor = Color.Yellow,
                        trailingIconColor = Color.Green,
                        disabledLeadingIconColor = Color.DarkGray,
                        disabledTextColor = Color.Black,
                        disabledTrailingIconColor = Color.Blue
                    )
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewMyDropDownMenu() {
    val list = listOf("Fruit", "Towel", "Football", "Carlos", "Phones")
    MyDropDownMenu(list)
}