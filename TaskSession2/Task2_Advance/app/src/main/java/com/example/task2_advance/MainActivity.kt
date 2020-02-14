package com.example.task2_advance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import android.view.View
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),RecyclerInterface {
    override fun onClick(menu: String) {
        Toast.makeText(this,menu,Toast.LENGTH_SHORT).show();
    }
var isHasPressed=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDrawer.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                drawerLayout.openDrawer(Gravity.RIGHT)
            }
        })
        val menu= arrayListOf<String>("DashBoard","Setting","Exit","About Us")
        val adapter=RecyclerAdapter(menu,this)
        recycler.adapter=adapter


    }

    override fun onBackPressed() {
        if(isHasPressed)

        super.onBackPressed()
        else
            isHasPressed=true
        Toast.makeText(this,"please",Toast.LENGTH_SHORT).show()
        Handler().postDelayed(Runnable { isHasPressed=false },2500)
    }
}

