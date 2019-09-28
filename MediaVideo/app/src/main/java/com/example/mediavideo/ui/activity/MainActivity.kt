package com.example.mediavideo.ui.activity

import androidx.appcompat.widget.Toolbar
import com.example.mediavideo.R
import com.example.mediavideo.base.BaseActivity
import com.example.mediavideo.util.ToolBarManager
import org.jetbrains.anko.find

class MainActivity : BaseActivity(), ToolBarManager {

    override val toolBar by lazy {
        find<Toolbar>(R.id.toolbar)
    }

    override fun getContentView(): Int {
        return R.layout.activity_main
    }

    override fun initData() {
        super.initData()
        initMainActToolBar()
    }

}

