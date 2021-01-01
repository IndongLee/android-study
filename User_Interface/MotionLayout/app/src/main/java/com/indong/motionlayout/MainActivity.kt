package com.indong.motionlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonBackgroundColor.setOnClickListener {
            startActivity(Type.BACKGROUND_COLOR)
        }
    }

    private fun startActivity(type: Type) {
        val cls = when (type) {
            Type.BACKGROUND_COLOR -> BackgroundColorActivity::class.java
        }

        val intent = Intent(this, cls)
        startActivity(intent)
    }

    enum class Type {
        BACKGROUND_COLOR
    }
}