package com.example.firsttolast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class splachActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splach)



        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@splachActivity,MainActivity::class.java))
            finish()
        },2000)
    }
}