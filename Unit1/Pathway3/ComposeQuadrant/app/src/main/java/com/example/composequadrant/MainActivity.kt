package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign.Companion.Justify
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme() {
                ComposeQuadrantApp()
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {
    val modifier = Modifier.fillMaxHeight()
    Column {
        Row(
            modifier.weight(1f),
        ) {
            ComposableInfoCard(
                title = stringResource(id = R.string.first_title),
                description = stringResource(id = R.string.first_description),
                backgroundColor = Color.Green,
                modifier = modifier.weight(1f),
            )

            ComposableInfoCard(
                title = stringResource(id = R.string.second_title),
                description = stringResource(id = R.string.second_title),
                backgroundColor = Color.Yellow,
                modifier = modifier.weight(1f),
            )
        }
        Row(
            modifier.weight(1f),
        ) {
            ComposableInfoCard(
                title = stringResource(id = R.string.third_title),
                description = stringResource(id = R.string.third_title),
                backgroundColor = Color.Cyan,
                modifier = modifier.weight(1f),
            )

            ComposableInfoCard(
                title = stringResource(id = R.string.fourth_title),
                description = stringResource(id = R.string.fourth_description),
                backgroundColor = Color.LightGray,
                modifier = modifier.weight(1f),
            )
        }
    }
}

@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier,
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.background(backgroundColor).padding(16.dp),
    ) {
        TitleText(message = title)
        DescriptionText(message = description)
    }
}

@Composable
fun TitleText(message: String) {
    Text(
        text = message,
        fontWeight = Bold,
        modifier = Modifier.padding(bottom = 16.dp),
    )
}

@Composable
fun DescriptionText(message: String) {
    Text(
        text = message,
        textAlign = Justify,
    )
}

@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantApp()
}
