package com.example.app3.presentation.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

@Composable
fun TableCellText(text: String, modifier: Modifier,fontWeight: FontWeight = FontWeight.Normal ,color: Color = Color.Black,textAlign: TextAlign = TextAlign.Center  ){
    Text(text = text, modifier = modifier, color = color,fontWeight = fontWeight, textAlign = textAlign )
}