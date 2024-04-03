package com.example.jetpackcomposecatalogo.composables.dialogs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties

data class ConfirmationDialogItem(val name: String)


val ITEMS = listOf(
    ConfirmationDialogItem("None"),
    ConfirmationDialogItem("Callisto"),
    ConfirmationDialogItem("Ganymede"),
    ConfirmationDialogItem("Luna"),
    ConfirmationDialogItem("Oberon"),
    ConfirmationDialogItem("Phobos"),
    ConfirmationDialogItem("Dione"),
    ConfirmationDialogItem("Towel"),
)

@Composable
fun MyConfirmationDialog(
    items: List<ConfirmationDialogItem>,
    show: Boolean,
    onDismiss: () -> Unit
) {

    var itemSelected by rememberSaveable {
        mutableStateOf(items[0].name)
    }

    if (show) {

        Dialog(
            onDismissRequest = { onDismiss.invoke() },
            properties = DialogProperties(
                dismissOnBackPress = false,
                dismissOnClickOutside = true
            ),
            content = {
                Column(
                    modifier = Modifier
                        .background(Color.White)
                        .fillMaxWidth()
                ) {
                    Text(
                        modifier = Modifier.padding(24.dp),
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp,
                        text = "Phone ringtone"
                    )

                    HorizontalDivider(
                        Modifier
                            .fillMaxWidth()
                            .height(1.dp), color = Color.LightGray)

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(250.dp)
                            .padding(start = 12.dp)
                            .verticalScroll(rememberScrollState())
                    ) {
                        items.map { item ->
                            DialogItem(
                                item = ConfirmationDialogItem(
                                    name = item.name
                                    //state = item.state,
                                    //onStateChange = item.onStateChange
                                ),
                                itemSelected = itemSelected,
                                onClick = { newItemSelected -> itemSelected = newItemSelected }
                            )
                        }
                    }

                    HorizontalDivider(Modifier.height(1.dp), color = Color.LightGray)

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 24.dp),
                        horizontalArrangement = Arrangement.End) {
                        TextButton(onClick = { onDismiss.invoke() }) {
                            Text(text = "CANCEL", color = Color.Magenta, fontWeight = FontWeight.SemiBold)
                        }
                        TextButton(onClick = { onDismiss.invoke() }) {
                            Text(text = "OK", color = Color.Magenta, fontWeight = FontWeight.SemiBold)
                        }
                    }
                }
            }
        )
    }
}

@Preview
@Composable
fun PreviewMyConfirmationDialog() {
    var show by remember {
        mutableStateOf(true)
    }
    MyConfirmationDialog(ITEMS, show) { show = false }
}

@Composable
private fun DialogItem(item: ConfirmationDialogItem, itemSelected: String, onClick: (String) -> Unit) {
    Row(
        Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioButton(selected = itemSelected == item.name, onClick = { onClick.invoke(item.name) })
        Text(
            modifier = Modifier.padding(start = 16.dp),
            text = item.name
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDialogItem() {
    var itemSelected by remember {
        mutableStateOf("Towel")
    }

    DialogItem(
        ConfirmationDialogItem(
            name = "Towel"
        ),
        itemSelected = itemSelected,
        onClick = { newItemSelected -> itemSelected = newItemSelected }
    )
}