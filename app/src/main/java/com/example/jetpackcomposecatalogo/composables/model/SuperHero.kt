package com.example.jetpackcomposecatalogo.composables.model

import androidx.annotation.DrawableRes
import com.example.jetpackcomposecatalogo.R

data class SuperHero(
    var superHeroName: String,
    var realName: String,
    var publisher: String,
    @DrawableRes var photo: Int
)

fun getSuperHeroes(): List<SuperHero> {
    return listOf(
        SuperHero("Flash", "Bartholomew Henry", "DC", R.drawable.flash),
        SuperHero("Batman", "Bruce Wayne", "DC", R.drawable.batman),
        SuperHero("Iron Man", "Downey Jr.", "Marvel", R.drawable.avatar),
        SuperHero("Spider-man", "Petter Parker", "Marvel", R.drawable.spiderman),
        SuperHero("Wolverine", "James Howlett", "Marvel", R.drawable.logan),
        SuperHero("Thor", "Thor Odinson", "Marvel", R.drawable.thor),
        SuperHero("Green Lantern", "Alan Scott", "DC", R.drawable.green_lantern),
        SuperHero("Daredevil", "Matt Murdock", "Marvel", R.drawable.daredevil),
        SuperHero("Wonderwoman", "Charles Moulton", "DC", R.drawable.wonder_woman),
    )
}