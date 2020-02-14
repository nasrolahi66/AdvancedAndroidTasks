package com.example.advancedandroidtask4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_search.*

class SearchActivity : AppCompatActivity(),Contract.SearchView  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        val presenter=Presenter(this)
        btnSearchCity.setOnClickListener{
         presenter.btnSearchCityClicked()

        }
    }
    override fun getCountryAndCity(): Pair<String, String> {
        val country=edtCountry.text.toString()
        val city=edtCity.text.toString()
        return city to country
    }

    override fun OpenResultPage(model: Model) {
        var intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("azanSob",model.azanSob)
        intent.putExtra("azanZohr",model.azanZohr)
        intent.putExtra("ghorub",model.ghorub)
        intent.putExtra("maghrib",model.maghrib)
        intent.putExtra("nimeshab",model.nimeshab)
        intent.putExtra("tolu",model.tolu)

        startActivity(intent)
    }


}
