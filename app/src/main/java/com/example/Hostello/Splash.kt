package com.example.Hostello

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val handler=Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent =Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },5000)


    }
}