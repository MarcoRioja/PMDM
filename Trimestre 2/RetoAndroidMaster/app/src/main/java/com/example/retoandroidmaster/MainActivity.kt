package com.example.retoandroidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.retoandroidmaster.Result
import com.google.android.material.slider.Slider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        val cardBoy = findViewById<CardView>(R.id.cardBoy)
        val cardGirl = findViewById<CardView>(R.id.cardGirl)
        val heightText = findViewById<TextView>(R.id.heightText)
        val heightSlider = findViewById<Slider>(R.id.heightSlider)
        var heightValue: Float = 50f
        heightText.setText(String.format("%.2fcm",heightValue))
        val weightText = findViewById<TextView>(R.id.weightText)
        val weightAdd = findViewById<Button>(R.id.addWeight)
        val weightSub = findViewById<Button>(R.id.subWeight)
        var weightValue = 0
        val ageText = findViewById<TextView>(R.id.ageText)
        val ageAdd = findViewById<Button>(R.id.addAge)
        val ageSub = findViewById<Button>(R.id.subAge)
        var ageValue = 0
        var gender: String = ""
        val result = Intent(this,Result::class.java)
        val btnNext = findViewById<Button>(R.id.nextBtn)

        cardBoy.setOnClickListener() {
            gender = "hombre"
            cardBoy.setCardBackgroundColor(getColor(R.color.light_gray))
            cardGirl.setCardBackgroundColor(getColor(R.color.gray))
        }

        cardGirl.setOnClickListener() {
            gender = "mujer"
            cardGirl.setCardBackgroundColor(getColor(R.color.light_gray))
            cardBoy.setCardBackgroundColor(getColor(R.color.gray))
        }

        heightSlider.addOnChangeListener { slider, value, fromUser ->
            heightValue = (value * 150) + 50
            heightText.setText(String.format("%.2fcm",heightValue))
        }

        weightAdd.setOnClickListener() {weightValue++; weightText.setText(""+weightValue+"kg")}
        weightSub.setOnClickListener() {weightValue--; weightText.setText(""+weightValue+"kg")}
        ageAdd.setOnClickListener() {ageValue++; ageText.setText(""+ageValue)}
        ageSub.setOnClickListener() {ageValue--; ageText.setText(""+ageValue)}

        btnNext.setOnClickListener() {
            var value: Float = weightValue/((heightValue*heightValue)/10000)
            result.putExtra("gender",gender)
            result.putExtra("age",ageValue)
            result.putExtra("weight",weightValue)
            result.putExtra("height",heightValue)
            result.putExtra("value",value)
            Log.d("Main",""+value)
            startActivity(result)
        }
    }

}