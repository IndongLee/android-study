package com.indong.motionlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonBackgroundColor.setOnClickListener {
            startActivity(Type.BACKGROUND_COLOR)
        }

        buttonImageTransition.setOnClickListener {
            startActivity(Type.IMAGE_TRANSITION)
        }

        buttonKeyframe.setOnClickListener {
            startActivity(Type.KEYFRAME)
        }

        buttonKeyframeInterpolation.setOnClickListener {
            startActivity(Type.KEYFRAME_INTERPOLATION)
        }

        buttonKeyframeCycle.setOnClickListener {
            startActivity(Type.KEYFRAME_CYCLE)
        }

        buttonCoordinatorLayout.setOnClickListener {
            startActivity(Type.COORDINATOR_LAYOUT)
        }

        buttonCoordinatorLayout2.setOnClickListener {
            startActivity(Type.COORDINATOR_LAYOUT2)
        }

        buttonDrawerLayout.setOnClickListener {
            startActivity(Type.DRAWER_LAYOUT)
        }

        buttonDrawerLayout2.setOnClickListener {
            startActivity(Type.DRAWER_LAYOUT2)
        }

        buttonSidePanel.setOnClickListener {
            startActivity(Type.SIDE_PANEL)
        }

        buttonParallax.setOnClickListener {
            startActivity(Type.PARALLAX)
        }

        buttonViewPager.setOnClickListener {
            startActivity(Type.VIEW_PAGER)
        }

        buttonViewPagerLottie.setOnClickListener {
            startActivity(Type.VIEW_PAGER_LOTTIE)
        }
    }

    private fun startActivity(type: Type) {
        val cls = when (type) {
            Type.BACKGROUND_COLOR -> BackgroundColorActivity::class.java
            Type.IMAGE_TRANSITION -> ImageTransitionActivity::class.java
            Type.KEYFRAME -> KeyframeActivity::class.java
            Type.KEYFRAME_INTERPOLATION -> KeyframeInterpolationActivity::class.java
            Type.KEYFRAME_CYCLE -> KeyframeCycleActivity::class.java
            Type.COORDINATOR_LAYOUT -> CoordinatorLayoutActivity::class.java
            Type.COORDINATOR_LAYOUT2 -> CoordinatorLayout2Activity::class.java
            Type.DRAWER_LAYOUT -> DrawerLayoutActivity::class.java
            Type.DRAWER_LAYOUT2 -> DrawerLayout2Activity::class.java
            Type.SIDE_PANEL -> SidePanelActivity::class.java
            Type.PARALLAX -> ParallaxActivity::class.java
            Type.VIEW_PAGER -> ViewPagerActivity::class.java
            Type.VIEW_PAGER_LOTTIE -> ViewPagerLottieActivity::class.java
        }

        val intent = Intent(this, cls)
        startActivity(intent)
    }

    enum class Type {
        BACKGROUND_COLOR,
        IMAGE_TRANSITION,
        KEYFRAME,
        KEYFRAME_INTERPOLATION,
        KEYFRAME_CYCLE,
        COORDINATOR_LAYOUT,
        COORDINATOR_LAYOUT2,
        DRAWER_LAYOUT,
        DRAWER_LAYOUT2,
        SIDE_PANEL,
        PARALLAX,
        VIEW_PAGER,
        VIEW_PAGER_LOTTIE
    }
}