package com.kim344.mvp_sample.module

import android.os.Bundle

class SampleScreenActivity: SampleScreenViewProtocol(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        presenter = SampleScreenPresenter(this)

        presenter?.onCreate(intent)
    }
}