package com.kim344.mvp_sample.module.tool

import android.content.Intent

class ToolScreenPresenter(view: ToolScreenViewProtocol) :
    ToolScreenPresenterProtocol(view) {

    override var router: ToolScreenRouterProtocol = ToolScreenRouter()
    override var interactor: ToolScreenInteractorProtocol = ToolScreenInteractor()

    override fun onCreate(intent: Intent?) {
    }
}