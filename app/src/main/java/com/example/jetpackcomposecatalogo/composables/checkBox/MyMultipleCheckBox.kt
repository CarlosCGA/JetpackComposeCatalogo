package com.example.jetpackcomposecatalogo.composables.checkBox

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

data class CheckBoxInfo(
    val title: String,
    var isChecked: Boolean,
    val onCheckedChange: (Boolean) -> Unit
)

@Composable
fun myCheckBoxList(titlesList: List<String>): List<CheckBoxInfo> {
    return titlesList.map { title ->
        var state by rememberSaveable { mutableStateOf(false) }
        CheckBoxInfo(
            title = title,
            isChecked = state,
            onCheckedChange = { newState ->
                state = newState
            }
        )
    }
}

@Composable
fun MyMultipleCheckBox(
    checkBoxInfo: CheckBoxInfo,
    onCheckBoxStateChange: (() -> Unit)?
) {
    Row(modifier = Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = checkBoxInfo.isChecked,
            onCheckedChange = {
                checkBoxInfo.onCheckedChange.invoke(!checkBoxInfo.isChecked)
                onCheckBoxStateChange!!.invoke()
            },
        )
        Text(text = checkBoxInfo.title)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMyMultipleCheckBox() {
    var state by rememberSaveable {
        mutableStateOf(false)
    }
    val checkBoxInfo = CheckBoxInfo(
        title = "Ejemplo 1",
        isChecked = false,
        onCheckedChange = { newState -> state = newState }
    )
    MyMultipleCheckBox(checkBoxInfo = checkBoxInfo, onCheckBoxStateChange = null)
}