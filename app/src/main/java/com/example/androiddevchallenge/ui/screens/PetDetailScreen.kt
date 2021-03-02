package com.example.androiddevchallenge.ui.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.data.PetModel

@Composable
fun PetDetailScreen(navController: NavHostController, index: String = "0") {
    val pet = PetModel.getPetList().plus(PetModel.getPetList())[index.toInt()]

        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {
            Image(
                painter = painterResource(id = pet.pic), contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(320.dp)
                    .clip(
                        RoundedCornerShape(
                            topStart = CornerSize(0.dp),
                            topEnd = CornerSize(0.dp),
                            bottomEnd = CornerSize(32.dp),
                            bottomStart = CornerSize(32.dp)
                        )
                    )
                )
            Text(
                text = pet.name,
                fontWeight = FontWeight.SemiBold,
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 0.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                InfoCard(
                    title = "Age",
                    text = pet.age,
                )
                InfoCard(
                    title = "Gender",
                    text = pet.gender,
                )
            }
            AboutSection(pet = pet)
        }
        Icon(
            Icons.Filled.ArrowBackIosNew, "back",
            modifier = Modifier
                .size(48.dp)
                .clickable {}
                .padding(12.dp)
        )
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom
    ) {
        AdoptButtonBar()
    }
}

@Composable
fun AboutSection(pet: PetModel) {
    Text(
        text = "Description",
        style = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(top = 12.dp,start = 12.dp, end = 12.dp)
    )
    Text(
        text = stringResource(id = pet.longDesc),
        textAlign = TextAlign.Justify,
        style = MaterialTheme.typography.caption,
        modifier = Modifier.padding(12.dp)
    )
    Spacer(modifier = Modifier.height(32.dp))
}

@Composable
fun InfoCard(title: String, text: String) {
    Card(
        modifier = Modifier
            .padding(start = 8.dp, end = 8.dp, top = 8.dp)
            .size(100.dp, 64.dp)
            .clip(MaterialTheme.shapes.medium),
        elevation = 8.dp,
        border = BorderStroke(1.dp, Color.Black)
    ) {
        Column(verticalArrangement = Arrangement.Center) {
            Text(
                text = title,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.caption
            )
            Text(
                text = text,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.SemiBold,
                style = MaterialTheme.typography.body1
            )
        }
    }
}


@Composable
fun AdoptButtonBar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Start
    ) {
        Button(
            elevation = null,
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .padding(16.dp)
                .weight(4f)
                .height(52.dp),
            onClick = { /*TODO*/ }
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White,
                    text = "Adopt Me"
                )
            }
        }
    }
}
