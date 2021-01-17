package com.indong.compose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.indong.compose.ui.theme.ComposeTheme

class BasicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyScreenContent()
        }
    }
}

@Composable
fun MyScreenContent(names: List<String> = listOf("Android", "there")) {
    ComposeTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = Color.Yellow) {
            Column {
                for (name in names) {
                    Greeting(name = name)
                    Divider(color = Color.Black)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name",
        modifier = Modifier.padding(24.dp))
}

@Preview(showBackground = true, name = "Text Preview")
@Composable
fun DefaultPreview2() {
    MyScreenContent()
}