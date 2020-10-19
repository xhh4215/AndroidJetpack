package com.xiaohei.jetpackinkotlin.bean

import androidx.databinding.*
import androidx.lifecycle.ViewModel
import com.xiaohei.jetpackinkotlin.BR

class UserViewModel : ViewModel(), Observable {
    private var callbacks: PropertyChangeRegistry = PropertyChangeRegistry()
    private var name = ObservableField("栾桂明")
    private var lastName = ObservableField("桂明")
    private var age = ObservableInt(0)

    @Bindable
    fun getName(): String {
        return name.get() ?: ""
    }

    fun setName(newName: String) {
        name.set(newName)
        this.notifyChange(BR.name)

    }

    fun addAge() {
        age.increment()
        this.notifyChange(BR.age)
    }

    fun mutableAge() {
        age.mutable()
        this.notifyChange(BR.age)
    }

    @Bindable
    fun getAge(): Int {
        return age.get()
    }

    fun setLastName(newName: String) {
        lastName.set(newName)
        this.notifyChange(BR.lastName)

    }

    @Bindable
    fun getLastName(): String {
        return lastName.get() ?: ""
    }


    fun notifyChange() {
        callbacks.notifyCallbacks(this, 0, null)
    }


    fun notifyChange(fieldId: Int) {
        callbacks.notifyCallbacks(this, fieldId, null)
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        callbacks.remove(callback)
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        callbacks.add(callback)
    }


    fun ObservableInt.increment() {
        set(get() + 1)
    }

    fun ObservableInt.mutable() {
        set(get() - 1)
    }
}