package com.xiaohei.jetpackinkotlin

import android.view.View
import android.widget.TextView
import android.widget.Toast

class MyHandlers {
    fun onClickFriend(view: View) {
        Toast.makeText(view.context, "点击事件", Toast.LENGTH_LONG).show()
    }


}