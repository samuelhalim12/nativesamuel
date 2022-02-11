package com.ubaya.nativesamuel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DashboardActivity : AppCompatActivity() {
    var hasLogin: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        print("ini dashboard")
    }
}