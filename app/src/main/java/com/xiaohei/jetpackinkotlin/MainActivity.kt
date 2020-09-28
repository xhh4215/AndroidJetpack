package com.xiaohei.jetpackinkotlin

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hideStatusBar()
        setContentView(R.layout.activity_main)

    }


    override fun onResume() {
        super.onResume()
        hideStatusBar()
    }


    fun hideStatusBar() {
        // android  4.0 以下使用如下方式进行状态栏的隐藏
        if (Build.VERSION.SDK_INT < 16) {
            window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        }
        // android 4.1 设置隐藏状态栏 界面标志被清除后（例如，离开 Activity），如果您希望再次隐藏这些栏，
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        //设置内容在状态栏之后 ，可以防止内容的变形
//        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        actionBar?.hide()
    }
}
