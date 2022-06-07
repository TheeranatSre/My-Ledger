package com.example.myledger.di.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myledger.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var openActivityTest: Button = findViewById(R.id.newActivity)
//
//        openActivityTest.setOnClickListener {
//            var intent = Intent(this, ActivityTest::class.java)
//            startActivity(intent)
//        }
    }
}