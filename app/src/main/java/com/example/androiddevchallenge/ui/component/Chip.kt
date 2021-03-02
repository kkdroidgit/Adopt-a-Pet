package com.example.androiddevchallenge.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.colorGreen
import com.example.androiddevchallenge.ui.theme.purple500

@Composable
fun Chip(content: String) {
    Text(
        text = content,
        style = typography.caption,
        color = purple500,
        modifier = Modifier
            .padding(3.dp)
    )
}