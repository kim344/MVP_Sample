package com.kim344.mvp_sample

interface MainConstants {

    interface View {
        // View 에 계산한 결과를 표시
        fun showResult(result: Int)
    }

    interface Presenter {
        // View 에서 입력한 두 수에 대한 덧셈
        fun addNum(input1 : Int, input2 : Int)

        // 데이터 저장
        fun saveData(date : Int)
    }

}