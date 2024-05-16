package com.example.jetpackcomposecatalogo.composables.buttons

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Done
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.ChipColors
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.SelectableChipColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyChip() {
    var isSelected by rememberSaveable {
        mutableStateOf(false)
    }
    FilterChip(
        selected = isSelected,
        onClick = { isSelected = !isSelected },
        leadingIcon = {
            AnimatedVisibility(visible = !isSelected, enter = fadeIn(), exit = fadeOut()) {
                Icon(imageVector = Icons.Outlined.Menu, contentDescription = "off")
            }
            AnimatedVisibility(visible = isSelected, enter = fadeIn(), exit = fadeOut()) {
                Icon(imageVector = Icons.Outlined.Done, contentDescription = "on")
            }
        },
        label = {
            Text(text = "My Chip")
        },
        shape = CircleShape,
        colors = FilterChipDefaults.filterChipColors(
        )
        /*
         private val containerColor: Color,
        private val labelColor: Color,
        private val leadingIconColor: Color,
        private val trailingIconColor: Color,
        private val disabledContainerColor: Color,
        private val disabledLabelColor: Color,
        private val disabledLeadingIconColor: Color,
        private val disabledTrailingIconColor: Color,
        private val selectedContainerColor: Color,
        private val disabledSelectedContainerColor: Color,
        private val selectedLabelColor: Color,
        private val selectedLeadingIconColor: Color,
        private val selectedTrailingIconColor: Color
         */
    )
}

@Preview(showBackground = true)
@Composable
fun MyChipPreview() {
    MyChip()
}