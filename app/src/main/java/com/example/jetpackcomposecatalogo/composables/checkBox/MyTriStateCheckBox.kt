package com.example.jetpackcomposecatalogo.composables.checkBox

import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.state.ToggleableState


@Composable
fun MyTriStateCheckBox(listOfCheckBoxInfo: List<CheckBoxInfo>) {
    var state by rememberSaveable { mutableStateOf(ToggleableState.Off) }
    TriStateCheckbox(state = state, onClick = {
        state = when (state) {
            ToggleableState.On -> {
                listOfCheckBoxInfo.map {checkBoxInfo ->
                    checkBoxInfo.isChecked = false
                }
                ToggleableState.Off
            }

            ToggleableState.Off -> {
                listOfCheckBoxInfo.map {checkBoxInfo ->
                    checkBoxInfo.isChecked = true
                }
                ToggleableState.On
                //ToggleableState.Indeterminate
            }

            ToggleableState.Indeterminate -> {
                ToggleableState.On
            }
        }
    })
}