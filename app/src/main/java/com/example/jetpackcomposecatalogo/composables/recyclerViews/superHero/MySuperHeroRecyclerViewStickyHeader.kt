package com.example.jetpackcomposecatalogo.composables.recyclerViews.superHero

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecatalogo.composables.recyclerViews.superHero.model.SuperHero
import com.example.jetpackcomposecatalogo.composables.recyclerViews.superHero.model.getSuperHeroes

/** Horizontal row, because can not show Vertical scroll in Main (have vertical scroll yet) **/
@ExperimentalFoundationApi
@Composable
fun MySuperHeroRecyclerViewStickyHeader() {
    val superHeroes: Map<String, List<SuperHero>> =
        getSuperHeroes().groupBy { superHero -> superHero.publisher }

    LazyRow(
        modifier = Modifier.padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        superHeroes.forEach { (publisher, superHeroesGroupedByPublisher) ->
            stickyHeader {
                Text(
                    modifier = Modifier
                        .fillMaxHeight()
                        .background(Color.Red)
                        .padding(horizontal = 8.dp),
                    text = publisher,
                    fontWeight = FontWeight.Bold
                )
            }

            items(superHeroesGroupedByPublisher) { superHero ->
                SuperHeroItem(superHero = superHero)
            }
        }


    }
}


@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
fun PreviewMySuperHeroRecyclerViewStickyHeader() {
    MySuperHeroRecyclerViewStickyHeader()
}