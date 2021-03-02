package com.example.androiddevchallenge.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.popUpTo
import com.example.androiddevchallenge.data.PetModel
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun PetListItem(pet: PetModel, navController: NavHostController, index: Int) {
    Card(
        elevation = 16.dp,
        shape = RoundedCornerShape(24.dp),
        modifier = Modifier
            .padding(8.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy((-15).dp),
            modifier = Modifier.clickable {
                navController.navigate("petDetail/$index") {
                    popUpTo(route = "petList") {}
                }
            },
        ) {
            Image(
                painter = painterResource(id = pet.pic),
                contentDescription = "Pet Pics",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(150.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .padding(16.dp)
            ) {
                Column {
                    Text(text = pet.name, style = typography.body1, fontWeight = FontWeight.Bold)
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.padding(top = 4.dp)
                    ) {
                        Chip(content = pet.gender)
                    }
                }
            }
        }
    }
}