package com.example.mediavideo.ui.activity

import androidx.appcompat.widget.Toolbar
import com.example.mediavideo.R
import com.example.mediavideo.base.BaseActivity
import com.example.mediavideo.util.ToolBarManager
import org.jetbrains.anko.find

/**
 *
 * Name: SettingActivity
 * Author: Administrator
 * Email:
 * Comment: //设置
 * Date: 2019-09-28 18:17
 *
 */
class SettingActivity : BaseActivity(), ToolBarManager {

    override val toolBar by lazy {
        find<Toolbar>(R.id.toolbar)
    }

    override fun getContentView(): Int {
        return R.layout.activity_setting
    }
}