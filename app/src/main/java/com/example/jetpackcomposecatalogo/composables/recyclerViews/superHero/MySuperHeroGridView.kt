package com.example.jetpackcomposecatalogo.composables.recyclerViews.superHero

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposecatalogo.composables.recyclerViews.superHero.model.getSuperHeroes

@Composable
fun MySuperHeroGridView() {

    LazyHorizontalGrid(rows = GridCells.Fixed(2), content = {
        items(getSuperHeroes()) { superHero ->
            SuperHeroItem(superHero = superHero)
        }
    })
}


@Preview(showBackground = true)
@Composable
fun PreviewMySuperHeroGridView() {
    MySuperHeroGridView()
}