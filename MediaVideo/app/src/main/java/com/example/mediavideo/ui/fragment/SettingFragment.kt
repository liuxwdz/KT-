package com.example.mediavideo.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.preference.Preference
import android.preference.PreferenceFragment
import android.preference.PreferenceScreen
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mediavideo.R
import com.example.mediavideo.ui.activity.AboutActivity

/**
 *
 * Name: SettingFragment
 * Author: Administrator
 * Email:
 * Comment: //设置
 * Date: 2019-09-28 19:16
 *
 */
class SettingFragment : PreferenceFragment() {
    override fun onCreateView(
        inflater: LayoutInflater?,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        addPreferencesFromResource(R.xml.setting)
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onPreferenceTreeClick(
        preferenceScreen: PreferenceScreen?,
        preference: Preference?
    ): Boolean {
        val key = preference?.key
        when (key) {
            "about" -> {
                activity.startActivity(Intent(activity, AboutActivity::class.java))
            }
            else -> {

            }
        }
        return super.onPreferenceTreeClick(preferenceScreen, preference)
    }
}