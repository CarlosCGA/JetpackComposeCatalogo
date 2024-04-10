package com.example.jetpackcomposecatalogo.composables.model

/** Created to put together all "screen" names in this class
 * and try to avoid duplicates and crashes
 * **/
sealed class Routes(val route: String) {
    data object AllContent : Routes("AllContent")
    data object MyScrollableColumn : Routes("MyScrollableColumn")
    data object MySimpleRecyclerView : Routes("MySimpleRecyclerView")
    data object MySuperHeroGridView : Routes("MySuperHeroGridView")
    data object MyScaffold : Routes("MyScaffold")
    data object MyListOfArgumentsPassThrough : Routes("MyListOfArgumentsPassThrough")
}