package com.example.retociclodevida_17_1_24_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class Page2 : AppCompatActivity() {
    var shopList = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        val page1 = Intent(this,Page1::class.java)
        val page2 = Intent(this,Page2::class.java)


        var btn1 = findViewById<Button>(R.id.btn1)
        var shopText = findViewById<TextView>(R.id.shops)
        var shopTextPrice = findViewById<TextView>(R.id.shopPrice)
        shopList = intent.getStringArrayListExtra("shopList")!!
        var shopPrice = intent.getFloatExtra("shopPrice",0.0f)

        shopText.setText("")
        if (shopList != null && shopList.size > 0) {
            for (product in shopList) {
                shopText.setText("" + shopText.text + product + "\n")
            }
        }
        shopTextPrice.setText("")
        if (shopPrice != null) {
            shopTextPrice.setText(String.format("%.2f€", shopPrice))
        }

        btn1.setOnClickListener {
            startActivity(page1)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("BUY", shopList.toString())
    }
}