package com.example.advancedandroidtask4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),Contract.MainView  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val presenter= Presenter(this)
        btnTimes.setOnClickListener{
            presenter.btnTimesClicked()

        }
        btnSearch.setOnClickListener{
            presenter.BtnSearchClicked()
        }


    }

    override fun openDrawer() {
        drawer.openDrawer(Gravity.RIGHT)
    }
    override fun OpenSearchPage()
    {

        val intent= Intent(this,SearchActivity::class.java)
        startActivity(intent)
    }


}

