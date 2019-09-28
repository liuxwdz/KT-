package com.example.mediavideo.util

import android.annotation.SuppressLint
import android.content.Intent
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import com.example.mediavideo.R
import com.example.mediavideo.ui.activity.SettingActivity

/**
 *
 * Name: ToolBarManager
 * Author: Administrator
 * Email:
 * Comment: //管理toolbar
 * Date: 2019-09-28 15:45
 *
 */
interface ToolBarManager {
    val toolBar: Toolbar

    @SuppressLint("RestrictedApi")
    fun initMainActToolBar() {
        toolBar.setTitle("手机影音")
        toolBar.inflateMenu(R.menu.main)
        toolBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.setting -> {
                    toolBar.context.startActivity(
                        Intent(
                            toolBar.context,
                            SettingActivity::class.java
                        )
                    )
                }
                else -> {

                }
            }
            true
        }
    }

    fun initSettingToolBar() {
        toolBar.setTitle("设置")
    }
}