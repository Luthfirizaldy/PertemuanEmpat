package com.example.pertemuanempat

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PlayActivity(
    modifier: Modifier = Modifier){
    Column(
        modifier = modifier.fillMaxSize()) {
        SectionHeader()
    }
}

@Composable
fun SectionHeader(){
    Box(modifier = Modifier.fillMaxWidth()
        .background(color = Color.LightGray)){
        Row {
            Box(contentAlignment = Alignment.BottomEnd){
                Image(painter = painterResource(id = R.drawable.logo),
                    contentDescription = "",
                    Modifier.size(100.dp)
                )
                Icon(Icons.Filled.Check,
                    contentDescription = "",
                    Modifier.padding(15.dp))
            }
        }
    }
}