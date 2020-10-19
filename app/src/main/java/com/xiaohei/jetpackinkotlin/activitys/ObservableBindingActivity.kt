package com.xiaohei.jetpackinkotlin.activitys

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.xiaohei.jetpackinkotlin.MyHandlers
import com.xiaohei.jetpackinkotlin.R
import com.xiaohei.jetpackinkotlin.bean.UserViewModel
import com.xiaohei.jetpackinkotlin.databinding.ActivityObservableViewBindingBinding

class ObservableBindingActivity : AppCompatActivity() {
    lateinit var binding: ActivityObservableViewBindingBinding
    lateinit var user: UserViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_view_binding)
        user = UserViewModel()
        binding.user = user
        binding.handler = MyHandlers()
        binding.add.setOnClickListener {
            user.addAge()
            Toast.makeText(this, "${user.getAge()}", Toast.LENGTH_SHORT).show()
        }
        binding.mutable.setOnClickListener {
            user.mutableAge()
        }

    }
}