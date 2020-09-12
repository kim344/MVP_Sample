package com.kim344.mvp_sample.module.sample

import android.content.Context
import android.content.Intent
import com.kim344.mvp_sample.base.BaseActivity
import com.kim344.mvp_sample.base.BasePresenter
import com.kim344.mvp_sample.main.MainActivity

fun startMainScreen(context: Context){
    val intent = Intent(context,MainActivity::class.java)
    context.startActivity(intent)
}

abstract class SampleScreenViewProtocol:
        BaseActivity<SampleScreenPresenterProtocol>(){

}

abstract class SampleScreenPresenterProtocol(view : SampleScreenViewProtocol):
        BasePresenter<SampleScreenViewProtocol>(view){

    abstract var router: SampleScreenRouterProtocol
    abstract var interactor: SampleScreenInteractorProtocol

    abstract fun onCreate(intent: Intent)
}

interface SampleScreenRouterProtocol {
    fun presentToolScreen(context: Context)
}

interface SampleScreenInteractorProtocol {

}
