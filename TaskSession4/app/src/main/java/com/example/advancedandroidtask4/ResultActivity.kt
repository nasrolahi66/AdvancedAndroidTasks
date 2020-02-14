package com.example.advancedandroidtask4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

class ResultActivity : AppCompatActivity(),Contract.ResultView{

    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        var intent = getIntent()

        txtazanMaghreb.text = "Azan Maghreb : "+ intent.getStringExtra("maghrib")
        txtazansob.text = "Azan Sobh : "+intent.getStringExtra("azanSob")
        txtazanZohr.text = "Azane Zohr : "+intent.getStringExtra("azanZohr")
        txtghorub.text = "Ghroub : "+intent.getStringExtra("ghorub")
        txtnimeShab.text = "Nime Shab : "+intent.getStringExtra("nimeshab")
    }
}
