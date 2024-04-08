package com.example.jetpackcomposecatalogo.composables.recyclerViews.superHero

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecatalogo.composables.model.getSuperHeroes
import kotlinx.coroutines.launch

@Composable
fun MySuperHeroRecyclerViewWithButton() {
    val scrollState = rememberLazyListState()
    val coroutinesScope = rememberCoroutineScope()

    Row(verticalAlignment = Alignment.CenterVertically) {
        LazyRow(
            modifier = Modifier
                .padding(vertical = 8.dp)
                .weight(1F),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            state = scrollState
        ) {
            items(getSuperHeroes()) { superHero ->
                SuperHeroItem(superHero = superHero)
            }
        }

        val showButton by remember {
            //Helps to don't update constantly the state (performance upgrade)
            derivedStateOf {
                scrollState.firstVisibleItemIndex > 0
            }
        }


        if (showButton) {
            Button(
                modifier = Modifier.padding(horizontal = 4.dp),
                onClick = {
                    coroutinesScope.launch {
                        scrollState.animateScrollToItem(0)
                    }
                }
            ) {
                Icon(
                    modifier = Modifier.rotate(90F),
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = "Back to start"
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewMySuperHeroRecyclerViewWithButton() {
    MySuperHeroRecyclerViewWithButton()
}