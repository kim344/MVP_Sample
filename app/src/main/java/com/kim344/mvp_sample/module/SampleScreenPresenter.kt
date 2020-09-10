package com.kim344.mvp_sample.module

import android.content.Intent

class SampleScreenPresenter(view: SampleScreenViewProtocol):
    SampleScreenPresenterProtocol(view) {

    override var router: SampleScreenRouterProtocol = SampleScreenRouter()
    override var interactor: SampleScreenInteractorProtocol = SampleScreenInteractor()

    override fun onCreate(intent: Intent) {

    }

}