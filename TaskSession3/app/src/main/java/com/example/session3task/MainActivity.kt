package com.example.session3task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val logger:(String)->Unit={Log.d("Tag",it)}

        val text="What you are talking about is the pre-processor and a complex one.You can type check variables declarations (you can do it with generics as well), but what about expressions? You will either have to annotate any expression results by hand or perform full language analysis."

        //Log.d("TAG",hour.toString())
       // Log.d("Tag",text.summrize())
        printString(3850000.secondToHour().toString(),logger)
        printString(text.summrize(),logger)




        val clickListener:(String)->Unit={
            Toast.makeText(this,it,Toast.LENGTH_SHORT).show()
        }
        val names= arrayListOf<String>("Shirin","Masoud","Barana")
       // val names=ArrayList<String>()
        val adapter=RecyclerAdapter(names,clickListener)
        recycler.adapter=adapter
    }

    public  fun printString(text:String,logger:(String)->Unit)
    {
        logger(text)
    }


    }

