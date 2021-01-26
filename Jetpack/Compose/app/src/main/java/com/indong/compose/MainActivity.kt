package com.indong.compose

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.AmbientContext
import androidx.compose.ui.platform.ContextAmbient
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            View()
        }
    }
}

@Composable
fun View() {
    val context = AmbientContext.current
    Column(Modifier.padding(16.dp)) {
        NewStory()
        ActivityButton(context = context, activity = BasicActivity::class.java, "Basic")
        ActivityButton(context = context, activity = LayoutActivity::class.java, "Layout")
    }
}

@Composable
fun NewStory() {
    val image = imageResource(id = R.drawable.header)
    MaterialTheme {
        val typography = MaterialTheme.typography

        Column {
            val imageModifier = Modifier
                .preferredHeight(180.dp)
                .fillMaxHeight()
                .clip(RoundedCornerShape(4.dp))

            Image(
                image,
                modifier = imageModifier,
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.preferredHeight(16.dp))

            Text(
                text = "A day wandering through the sandhills " +
                        "in Shark Fin Cove, and a few of the " +
                        "sights I saw",
                style = typography.h6,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = "Davenport, California",
                style = typography.body2
            )
            Text(
                text = "December 2018",
                style = typography.body2
            )
        }
    }
}

@Composable
fun ActivityButton(context: Context, activity: Class<out AppCompatActivity>, text: String) {
    Button(onClick = {
        val intent = Intent(context, activity)
        context.startActivity(intent)
    },
    modifier = Modifier.padding(0.dp, 10.dp, 0.dp, 0.dp)) {
        Text(text = text)
    }
}

@Preview
@Composable
fun DefaultPreview() {
    View()
}