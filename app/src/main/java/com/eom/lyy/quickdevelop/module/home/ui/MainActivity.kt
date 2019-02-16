package com.eom.lyy.quickdevelop.module.home.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.eom.lyy.quickdevelop.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt1.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.bt1->{

            }

        }
    }
}

