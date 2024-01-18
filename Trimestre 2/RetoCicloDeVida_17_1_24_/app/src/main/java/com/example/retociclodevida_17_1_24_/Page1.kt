package com.example.retociclodevida_17_1_24_

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class Page1 : AppCompatActivity() {
    var shopList = ArrayList<String>()
    var shopListPrice = ArrayList<Float>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val page1 = Intent(this,Page1::class.java);
        val page2 = Intent(this,Page2::class.java);

        var btn2 = findViewById<Button>(R.id.btn2)

        var btn_com_1 = findViewById<Button>(R.id.btn_com_1)
        var btn_com_2 = findViewById<Button>(R.id.btn_com_2)
        var btn_com_3 = findViewById<Button>(R.id.btn_com_3)

        shopList = ArrayList<String>()
        shopListPrice = ArrayList<Float>()
        btn_com_1.setOnClickListener{shopList.add("Figura de Gojo"); shopListPrice.add(29.99F)}
        btn_com_2.setOnClickListener{shopList.add("Figura de Nezuko"); shopListPrice.add(49.99F)}
        btn_com_3.setOnClickListener{shopList.add("Figura de Roxy"); shopListPrice.add(149.99F)}

        btn2.setOnClickListener {
            page2.putExtra("shopList", shopList)
            page2.putExtra("shopPrice", shopListPrice.sum())
            startActivity(page2)
        }
    }

    override fun onPause() {
        super.onPause()
        Log.i("SHOP", shopList.toString())
    }
}