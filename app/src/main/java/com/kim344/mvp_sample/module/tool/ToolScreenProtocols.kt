package com.kim344.mvp_sample.module.tool

import android.content.Intent
import com.kim344.mvp_sample.base.BaseActivity
import com.kim344.mvp_sample.base.BasePresenter

abstract class ToolScreenViewProtocol :
    BaseActivity<ToolScreenPresenterProtocol>() {

}

abstract class ToolScreenPresenterProtocol(view: ToolScreenViewProtocol) :
    BasePresenter<ToolScreenViewProtocol>(view) {

    abstract var router: ToolScreenRouterProtocol
    abstract var interactor: ToolScreenInteractorProtocol

    abstract fun onCreate(intent: Intent?)
}

interface ToolScreenInteractorProtocol {

}

interface ToolScreenRouterProtocol {

}