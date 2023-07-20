package com.example.taskcompleted

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskCompletedScreen()
        }
    }
}

@Composable
fun TaskCompletedScreen() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        CompleteImage(painterResource(id = R.drawable.ic_task_completed))
        CompleteMessage(stringResource(id = R.string.all_task_completed))
        CheerMessage(stringResource(id = R.string.nice_work))
    }
}

@Composable
fun CompleteImage(image: Painter) {
    Image(painter = image, contentDescription = "")
}

@Composable
fun CompleteMessage(message: String) {
    Text(
        text = message,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
    )
}

@Composable
fun CheerMessage(message: String) {
    Text(
        text = message,
        fontSize = 16.sp,
    )
}

@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    TaskCompletedScreen()
}
