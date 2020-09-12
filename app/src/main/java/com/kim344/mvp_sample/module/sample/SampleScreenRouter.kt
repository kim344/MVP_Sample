package com.kim344.mvp_sample.module.sample

import android.content.Context
import android.content.Intent
import com.kim344.mvp_sample.module.sample.SampleScreenRouterProtocol
import com.kim344.mvp_sample.module.tool.ToolScreenActivity

class SampleScreenRouter: SampleScreenRouterProtocol {
    override fun presentToolScreen(context: Context) {
        val intent = Intent(context, ToolScreenActivity::class.java)
        context.startActivity(intent)
    }

}