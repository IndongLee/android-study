package com.indong.compose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewStory()
        }
    }
}

@Composable
fun NewStory() {
    val image = imageResource(id = R.drawable.header)
    Column(Modifier.padding(16.dp)) {
        val imageModifier = Modifier
            .preferredHeight(180.dp)
            .fillMaxHeight()
        Image(image,
        modifier = imageModifier,
        contentScale = ContentScale.Crop)

        Spacer(modifier = Modifier.preferredHeight(16.dp))

        Text(text = "A day in Shark Fin Cove")
        Text(text = "Davenport, California")
        Text(text = "December 2018")
    }
}

@Preview
@Composable
fun DefaultPreview() {
    NewStory()
}