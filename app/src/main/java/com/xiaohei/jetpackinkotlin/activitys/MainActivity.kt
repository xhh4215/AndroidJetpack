package com.xiaohei.jetpackinkotlin.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xiaohei.jetpackinkotlin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_data_store.setOnClickListener {
            val intent = Intent(this, ViewBindingActivity::class.java)
            startActivity(intent)
        }
        btn_view_binding.setOnClickListener {

            val intent = Intent(this, DataStoreActivity::class.java)
            startActivity(intent)
        }


    }
}
