package com.example.jetpackcomposecatalogo.composables.checkBox

import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.ui.state.ToggleableState


@Composable
fun MyTriStateCheckBox(myTriStateCheckBoxInfo: MyTriStateCheckBoxInfo) {
    TriStateCheckbox(
        state = myTriStateCheckBoxInfo.state,
        onClick = {
            when (myTriStateCheckBoxInfo.state) {
                ToggleableState.On -> {
                    myTriStateCheckBoxInfo.listOfCheckBoxInfo.map { checkBoxInfo ->
                        checkBoxInfo.onCheckedChange.invoke(false)
                    }
                    myTriStateCheckBoxInfo.updateStateOfTriStateCheckBox.invoke(ToggleableState.Off)
                }

                ToggleableState.Off -> {
                    myTriStateCheckBoxInfo.listOfCheckBoxInfo.map { checkBoxInfo ->
                        checkBoxInfo.onCheckedChange.invoke(true)
                    }
                    myTriStateCheckBoxInfo.updateStateOfTriStateCheckBox.invoke(ToggleableState.On)
                }

                ToggleableState.Indeterminate -> {
                    myTriStateCheckBoxInfo.listOfCheckBoxInfo.map { checkBoxInfo ->
                        checkBoxInfo.onCheckedChange.invoke(true)
                    }
                    myTriStateCheckBoxInfo.updateStateOfTriStateCheckBox.invoke(ToggleableState.On)
                }
            }
        }
    )
}

data class MyTriStateCheckBoxInfo(
    var state: ToggleableState,
    val updateStateOfTriStateCheckBox: (ToggleableState) -> Unit,
    val listOfCheckBoxInfo: List<CheckBoxInfo>
)