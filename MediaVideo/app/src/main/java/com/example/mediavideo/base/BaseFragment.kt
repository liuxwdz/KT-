package com.example.mediavideo.base

import android.os.Bundle
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.runOnUiThread
import org.jetbrains.anko.toast

/**
 *
 * Name: BaseFragment
 * Author: Administrator
 * Email:
 * Comment: //基类fragment
 * Date: 2019-09-28 10:37
 *
 */
abstract class BaseFragment : Fragment(), AnkoLogger {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return getCreateView(inflater, container, savedInstanceState)
    }

    abstract fun getCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initListener()
        initData()
    }

    open protected fun initData() {

    }

    open protected fun initListener() {

    }

    open protected fun init() {

    }

    fun showToast(msg: String) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            context?.runOnUiThread { context?.toast(msg) }
        } else {
            context?.toast(msg)
        }
    }
}