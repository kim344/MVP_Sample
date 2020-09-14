package com.kim344.mvp_sample.module.tool

import android.os.Bundle

class ToolScreenActivity: ToolScreenViewProtocol() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        presenter = ToolScreenPresenter(this)

        presenter?.onCreate(intent)
    }
}