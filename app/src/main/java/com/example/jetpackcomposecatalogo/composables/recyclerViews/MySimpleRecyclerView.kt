package com.example.jetpackcomposecatalogo.composables.recyclerViews

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun MySimpleRecyclerView() {
    val myList = listOf("Carlos", "Towel", "Mouse", "Cat")

    LazyColumn {
        item {
            Text(text = "Hi! I am an item")
        }
        items(7) {
            Text(text = "Hi! I am the item $it")
        }
        items(myList) {
            Text(text = "Hi! I am $it")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMySimpleRecyclerView() {
    MySimpleRecyclerView()
}