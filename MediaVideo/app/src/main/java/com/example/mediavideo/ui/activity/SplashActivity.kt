package com.example.mediavideo.ui.activity

import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.ViewPropertyAnimatorListener
import com.example.mediavideo.R
import com.example.mediavideo.base.BaseActivity
import kotlinx.android.synthetic.main.activity_splash.*
import org.jetbrains.anko.startActivity

class SplashActivity : BaseActivity(), ViewPropertyAnimatorListener {
    override fun onAnimationEnd(view: View?) {
        startAct<MainActivity>()
    }

    override fun onAnimationCancel(view: View?) {
    }

    override fun onAnimationStart(view: View?) {
    }

    override fun getContentView(): Int {
        return R.layout.activity_splash
    }

    override fun initData() {
        super.initData()
        ViewCompat.animate(imageSplash).scaleX(1.0f).scaleY(1.0f).setListener(this)
            .setDuration(4000).start()

    }

}

