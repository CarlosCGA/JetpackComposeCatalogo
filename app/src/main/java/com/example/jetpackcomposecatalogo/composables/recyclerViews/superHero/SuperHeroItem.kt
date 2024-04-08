package com.example.jetpackcomposecatalogo.composables.recyclerViews.superHero

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
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
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposecatalogo.composables.recyclerViews.superHero.model.SuperHero
import com.example.jetpackcomposecatalogo.composables.recyclerViews.superHero.model.getSuperHeroes

@Composable
fun SuperHeroItem(superHero: SuperHero) {
    Surface(border = BorderStroke(3.dp, Color.LightGray), shape = RoundedCornerShape(8.dp)) {
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .size(200.dp)
                    .clip(RoundedCornerShape(8.dp)),
                painter = painterResource(id = superHero.photo),
                contentDescription = "SuperHero image"
            )
            Spacer(modifier = Modifier.size(8.dp))
            Text(text = superHero.superHeroName, fontWeight = FontWeight.Bold)
            Text(text = superHero.realName)
            Spacer(modifier = Modifier.size(8.dp))
            Card(modifier = Modifier.align(Alignment.End), shape = RoundedCornerShape(8.dp)) {
                Text(
                    modifier = Modifier.padding(4.dp),
                    text = superHero.publisher,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMySuperHeroItem() {
    SuperHeroItem(superHero = getSuperHeroes()[1])
}