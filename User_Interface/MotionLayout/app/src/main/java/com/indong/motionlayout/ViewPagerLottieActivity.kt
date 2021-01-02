package com.indong.motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.viewpager.widget.ViewPager
import com.indong.motionlayout.viewpager.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_view_pager_lottie.*
import kotlinx.android.synthetic.main.header_lottie.*

class ViewPagerLottieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager_lottie)

        val motionLayout = motionLayout

        val adapter = ViewPagerAdapter(supportFragmentManager).apply {
            addPage("Page 1", R.layout.item_viewpager_page1)
            addPage("Page 2", R.layout.item_viewpager_page2)
            addPage("Page 3", R.layout.item_viewpager_page3)
        }

        pager.adapter = adapter
        tabs.setupWithViewPager(pager)
        if (motionLayout != null) {
            pager.addOnPageChangeListener(motionLayout as ViewPager.OnPageChangeListener)
        }

        val debugMode = if (intent.getBooleanExtra("showPaths", false)) {
            MotionLayout.DEBUG_SHOW_PATH
        } else {
            MotionLayout.DEBUG_SHOW_NONE
        }
        motionLayout.setDebugMode(debugMode)
    }
}