package com.kim344.mvp_sample.base

import android.content.Intent
import androidx.fragment.app.Fragment

abstract class BaseFragment<T: PresenterInterface>: Fragment() {

    protected var presenter: T? = null

    override fun onDestroyView() {
        presenter?.onDestroy()
        presenter = null
        super.onDestroyView()
    }

    fun onFragmentComplete(intent: Intent?) {
        context?.let {
            if (it is BaseActivity<*>) {
                it.onFragmentComplete(intent)
            }
        }
    }
}