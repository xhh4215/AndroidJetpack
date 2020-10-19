package com.xiaohei.jetpackinkotlin.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
 import androidx.databinding.DataBindingUtil
 import com.xiaohei.jetpackinkotlin.R
import com.xiaohei.jetpackinkotlin.bean.LiveDataUser
 import com.xiaohei.jetpackinkotlin.databinding.ActivityViewBindingBinding

class ViewBindingActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewBindingBinding
    lateinit var user: LiveDataUser
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_view_binding)
        user = LiveDataUser()
        binding.user = user
        binding.lifecycleOwner = this
        binding.add.setOnClickListener {
            user.addAge()
        }
        binding.mutable.setOnClickListener {
            user.mutableAge()
        }

    }


}