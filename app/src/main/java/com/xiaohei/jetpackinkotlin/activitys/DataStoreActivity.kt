package com.xiaohei.jetpackinkotlin.activitys

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.datastore.Serializer
import androidx.datastore.preferences.Preferences
import androidx.datastore.preferences.createDataStore
import androidx.datastore.preferences.edit
import androidx.datastore.preferences.preferencesKey
import com.xiaohei.jetpackinkotlin.R
import kotlinx.android.synthetic.main.activity_data_store.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import java.io.InputStream
import java.io.OutputStream

class DataStoreActivity : AppCompatActivity() {
    private object PreferencesKeys {
        val SHOW_COMPLETED = preferencesKey<String>("show_completed")
    }

    val datastore = this.applicationContext.createDataStore("setting")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_store)
        //
        saveValue.setOnClickListener {

        }

        getValue.setOnClickListener {

        }
    }

    /***
     * 向datasourece存储数据
     */
    suspend fun updateShowCompleted(showCompleted: String) {
        datastore.edit { preferences ->
            preferences[PreferencesKeys.SHOW_COMPLETED] = showCompleted
        }
    }

    /****
     * 从datastore中读取数据
     */
    fun getShowCompleted(): Flow<UserPreferences> {
        return datastore.data.map { preferences ->
            val showCompleted = preferences[PreferencesKeys.SHOW_COMPLETED] ?: ""
            UserPreferences(showCompleted)
        }

    }

}


data class UserPreferences(val showCompleted: String)