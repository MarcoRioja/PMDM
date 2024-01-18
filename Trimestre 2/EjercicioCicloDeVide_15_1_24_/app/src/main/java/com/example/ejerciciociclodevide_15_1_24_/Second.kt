package com.example.ejerciciociclodevide_15_1_24_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class Second : AppCompatActivity() {
    private val TAG = "Second"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var btn = findViewById<Button>(R.id.button)
        val main = Intent(this,MainActivity::class.java);

        btn.setOnClickListener {
            startActivity(main)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG,"onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"onDestroy")
    }
}