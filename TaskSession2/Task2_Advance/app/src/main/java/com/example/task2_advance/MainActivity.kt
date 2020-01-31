package com.example.task2_advance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),RecyclerInterface {
    override fun onClick(menu: String) {
        Toast.makeText(this,menu,Toast.LENGTH_SHORT).show();
    }

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
}
