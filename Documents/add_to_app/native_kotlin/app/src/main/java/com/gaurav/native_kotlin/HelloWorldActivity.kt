package com.gaurav.native_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HelloWorldActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world)
    }
}