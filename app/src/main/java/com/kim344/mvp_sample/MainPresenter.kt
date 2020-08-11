package com.kim344.mvp_sample

class MainPresenter(view : MainConstants.View) : MainConstants.Presenter {

    var mainView : MainConstants.View = view
    var mainModel : MainModel = MainModel(this)

    override fun addNum(input1: Int, input2: Int) {
        mainView.showResult(input1+input2)
    }

    override fun saveData(data: Int) {
        mainModel.saveData(data)
    }
}