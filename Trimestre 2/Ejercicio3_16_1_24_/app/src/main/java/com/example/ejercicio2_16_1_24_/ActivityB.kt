package com.example.ejercicio2_16_1_24_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ActivityB : AppCompatActivity() {
    private val TAG = "B"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        var btn = findViewById<Button>(R.id.button)
        val second = Intent(this,ActivityC::class.java);

        btn.setOnClickListener {
            startActivity(second)
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