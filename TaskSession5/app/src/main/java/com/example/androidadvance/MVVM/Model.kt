package com.example.androidadvance.MVVM

import android.util.Log
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class Model(val viewModel:ViewModel) {
    val retrofit= Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .baseUrl("https://api.aladhan.com/v1/")
        .build()

//    val aladhanInterface=retrofit.create(AladhanInterface::class.java)
//    aladhanInterface.getAzan(city,country,8).observeOn(AndroidSchedulers.mainThread())
//    .subscribeOn(Schedulers.io())
//    .subscribe({it.data.timings.Fajr},{ Log.d("Tag",it.message)})
}