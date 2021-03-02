package com.example.androiddevchallenge.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.data.PetModel
import com.example.androiddevchallenge.ui.component.CenterLabel
import com.example.androiddevchallenge.ui.component.TopBar
import com.example.androiddevchallenge.ui.component.PetListItem

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PetListScreen(navController: NavHostController) {
    val pets = PetModel.getPetList().plus(PetModel.getPetList())
    Surface {
        Column {
            TopBar()
            CenterLabel()
            LazyVerticalGrid(
                cells = GridCells.Fixed(2),
                contentPadding = PaddingValues(24.dp),
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                itemsIndexed(pets) { index, pet ->
                    PetListItem(pet, navController, index)
                }
            }
        }
    }
}