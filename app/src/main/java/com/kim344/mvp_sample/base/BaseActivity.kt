package com.kim344.mvp_sample.base

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

const val TOUCH_THROTTLE_TIME = 500L

abstract class BaseActivity<T: PresenterInterface>: AppCompatActivity(){
    protected var presenter: T? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
    }

    override fun onDestroy() {
        presenter?.onDestroy()
        presenter = null
        super.onDestroy()
    }

    fun onFragmentComplete(resultData: Intent?) {
        presenter?.onFragmentComplete(resultData)
    }
}