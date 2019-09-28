package com.example.mediavideo.base

import android.os.Bundle
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

/**
 *
 * Name: BaseActivity
 * Author: Administrator
 * Email:
 * Comment: //基类
 * Date: 2019-09-28 10:24
 *
 */
abstract class BaseActivity : AppCompatActivity(), AnkoLogger {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getContentView())
        initListener()
        initData()
    }

    open protected fun initData() {

    }

    open protected fun initListener() {

    }

    abstract fun getContentView(): Int

    fun showToast(msg: String) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            runOnUiThread { toast(msg) }
        } else {
            toast(msg)
        }
    }

    inline fun <reified T : BaseActivity> startAct() {
        startActivity<T>()
        finish()
    }

}