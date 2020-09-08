package com.kim344.mvp_sample.base

import android.content.Intent

interface PresenterInterface {
    fun onDestroy()
    fun onFragmentComplete(resultData : Intent?)
}