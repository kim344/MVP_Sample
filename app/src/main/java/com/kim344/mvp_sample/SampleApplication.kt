package com.kim344.mvp_sample

import android.app.Application
import android.content.Context

class SampleApplication : Application() {

    companion object {
        lateinit var globalApplication : Context
    }

    override fun onCreate() {
        globalApplication = this
        super.onCreate()
    }

}