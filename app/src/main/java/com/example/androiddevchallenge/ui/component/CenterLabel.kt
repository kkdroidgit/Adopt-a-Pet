package com.example.androiddevchallenge.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.R

@Composable
fun CenterLabel() {
    Card(
        backgroundColor = colorResource(id = R.color.white),
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier.padding(
            top = 16.dp, start = 8.dp, end = 8.dp
        ),
        elevation = 16.dp,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .clickable(onClick = {})
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "avatar",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(start = 12.dp)
                    .size(48.dp)
                    .clip(CircleShape)
                    .border(2.dp, Color.Gray, CircleShape)
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp, bottom = 8.dp)
            ) {
                Text(
                    text = "Join or Animal Lovers Community",
                    style = LocalTextStyle.current.copy(
                        color = colorResource(id = R.color.black),
                        fontSize = 20.sp,
                    ),
                    textAlign = TextAlign.Center
                )
                Button(
                    elevation = null,
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier
                        .padding(16.dp),
                    onClick = { null }
                ) {
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White,
                            text = "Join Now"
                        )
                    }
                }
            }
        }
    }
}