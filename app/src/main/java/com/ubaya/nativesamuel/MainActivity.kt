package com.ubaya.nativesamuel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    // perlu bikin fitur login
    var login: Boolean = false
    var abc: String = "abc"
    var test ="coba"
    var tamba = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}