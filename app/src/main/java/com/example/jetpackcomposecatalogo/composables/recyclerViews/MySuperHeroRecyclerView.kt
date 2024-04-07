package com.example.jetpackcomposecatalogo.composables.recyclerViews

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecatalogo.R

data class SuperHero(
    var superHeroName: String,
    var realName: String,
    var publisher: String,
    @DrawableRes var photo: Int
)

@Composable
fun MySuperHeroRecyclerView() {
    LazyRow(
        modifier = Modifier.padding(vertical = 8.dp, horizontal = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(getSuperHeroes()) { superHero ->
            SuperHeroItem(superHero = superHero)
        }

    }
}

fun getSuperHeroes(): List<SuperHero> {
    return listOf(
        SuperHero("Iron Man", "Downey Jr.", "Marvel", R.drawable.avatar),
        SuperHero("Spiderman", "Petter Parker", "Marvel", R.drawable.spiderman),
        SuperHero("Wolverine", "Petter Parker", "James Howlett", R.drawable.logan),
        SuperHero("Thor", "Thor Odinson", "Marvel", R.drawable.thor),
        SuperHero("Batman", "Bruce Wayne", "DC", R.drawable.batman),
    )
}

@Composable
fun SuperHeroItem(superHero: SuperHero) {
    Surface(border = BorderStroke(3.dp, Color.LightGray), shape = RoundedCornerShape(8.dp)) {
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier.size(200.dp).clip(RoundedCornerShape(8.dp)),
                painter = painterResource(id = superHero.photo),
                contentDescription = "SuperHero image"
            )
            Spacer(modifier = Modifier.size(8.dp))
            Text(text = superHero.superHeroName, fontWeight = FontWeight.Bold)
            Text(text = superHero.realName)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewMySuperHeroRecyclerView() {
    MySuperHeroRecyclerView()
}