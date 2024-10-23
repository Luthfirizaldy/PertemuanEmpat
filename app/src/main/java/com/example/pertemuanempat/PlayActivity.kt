package com.example.pertemuanempat

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

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

}