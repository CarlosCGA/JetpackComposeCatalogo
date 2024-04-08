package com.example.jetpackcomposecatalogo.composables.recyclerViews.superHero

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecatalogo.composables.model.getSuperHeroes

@Composable
fun MySuperHeroRecyclerView() {
    LazyRow(
        modifier = Modifier.padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(getSuperHeroes()) { superHero ->
            SuperHeroItem(superHero = superHero)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewMySuperHeroRecyclerView() {
    MySuperHeroRecyclerView()
}