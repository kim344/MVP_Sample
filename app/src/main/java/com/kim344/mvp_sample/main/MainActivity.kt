package com.kim344.mvp_sample.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kim344.mvp_sample.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),
    MainConstants.View {

    lateinit var mainPresenter: MainConstants.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter = MainPresenter(this)

        initListener()
    }

    private fun initListener(){
        val inputA = editInputA.text.toString()
        val inputB = editInputB.text.toString()

        btnResult.setOnClickListener {
            mainPresenter.addNum(inputA.toInt(),inputB.toInt())
        }
    }

    override fun showResult(result: Int) {
        txtResult.setText(result)
    }

}