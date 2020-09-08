package com.kim344.mvp_sample.base

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.fragment.app.Fragment

abstract class BasePresenter<T>(view : T) : PresenterInterface {
    protected var screenView: T? =view
    protected var context: Context? = null

    init {
        if (view is Activity){
            context = view
        } else if (view is Fragment){
            context = view.context
        }
    }

    override fun onDestroy() {
        screenView = null
        context = null
    }

    override fun onFragmentComplete(resultData: Intent?) {

    }
}