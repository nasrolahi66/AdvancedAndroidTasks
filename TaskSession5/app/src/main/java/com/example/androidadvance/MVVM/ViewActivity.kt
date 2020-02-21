package com.example.androidadvance.MVVM

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidadvance.R

class ViewActivity : AppCompatActivity() {
var viewModel=ViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

    }
}
