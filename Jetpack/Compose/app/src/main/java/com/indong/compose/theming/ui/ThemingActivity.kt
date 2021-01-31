package com.indong.compose.theming.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Surface
import androidx.compose.ui.platform.setContent
import com.indong.compose.ui.theme.BasicCodelabTheme

class ThemingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicCodelabTheme {
                Surface {
                    Home()
                }
            }
        }
    }
}