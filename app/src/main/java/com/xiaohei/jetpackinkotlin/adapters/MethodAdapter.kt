package com.xiaohei.jetpackinkotlin.adapters

 import android.widget.TextView
 import androidx.databinding.BindingAdapter
 import androidx.databinding.BindingMethod
 import androidx.databinding.BindingMethods

@BindingMethods(BindingMethod(type = TextView::class,attribute = "android:textColor",method = "myTextColor"))
class MethodAdapter