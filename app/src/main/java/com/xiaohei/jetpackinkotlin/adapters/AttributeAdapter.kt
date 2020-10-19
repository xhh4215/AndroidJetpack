package com.xiaohei.jetpackinkotlin.adapters

import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.databinding.InverseBindingAdapter

@BindingAdapter("android:paddingLeft")
fun setPaddingLeft(view: View, padding: Int) {
    view.setPadding(padding, view.paddingTop, view.paddingRight, view.paddingLeft)

}

@BindingAdapter("textValue")
fun setText(view: TextView, value: Int) {
    view.text = value.toString()
}




class AttributeAdapter