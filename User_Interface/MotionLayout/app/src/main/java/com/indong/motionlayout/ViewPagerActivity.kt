package com.indong.motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout
import com.indong.motionlayout.viewpager.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_parallax.*
import kotlinx.android.synthetic.main.activity_view_pager.*

class ViewPagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        val viewPagerHeader = motionLayout

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addPage("Page 1", R.layout.item_viewpager_page1)
        adapter.addPage("Page 2", R.layout.item_viewpager_page2)
        adapter.addPage("Page 3", R.layout.item_viewpager_page3)
        pager.adapter = adapter
        tabs.setupWithViewPager(pager)
        if (viewPagerHeader != null) {
            pager.addOnPageChangeListener(viewPagerHeader)
        }

        val debugMode = if (intent.getBooleanExtra("showPaths", false)) {
            MotionLayout.DEBUG_SHOW_PATH
        } else {
            MotionLayout.DEBUG_SHOW_NONE
        }
        viewPagerHeader.setDebugMode(debugMode)
    }
}