package com.example.advancedandroidtask4

import android.util.Log
import com.example.advancedandroidtask4.Pojo.AladhanResponseCurrentTimeModel
import com.example.advancedandroidtask4.Pojo.AladhanResponseModel
import com.example.advancedandroidtask4.Retrofit.CurrentTimeInterface
import com.example.advancedandroidtask4.Retrofit.TimesInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class Model(val presenter:Contract.Presenter) {
    var azanSob=""
    var tolu=""
    var azanZohr=""
    var ghorub=""
    var maghrib=""
    var nimeshab=""

        fun fillTimes(country:String,city:String)
        {
            val retrofit= Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.aladhan.com/v1/")
                .build()
             val timesInterface=retrofit.create(TimesInterface::class.java)
            timesInterface.getTimings(city,country,8)
                .enqueue(object: Callback<AladhanResponseModel>{
                override fun onFailure(call: Call<AladhanResponseModel>, t: Throwable) {
                    Log.d("TAG",t.message)
                }

                override fun onResponse(
                    call: Call<AladhanResponseModel>,
                    response: Response<AladhanResponseModel>
                ) {
                    azanSob=response.body()?.data?.timings?.Fajr.toString()
                    tolu=response.body()?.data?.timings?.Sunrise.toString()
                    azanZohr=response.body()?.data?.timings?.Dhuhr.toString()
                    ghorub=response.body()?.data?.timings?.Maghrib.toString()
                    nimeshab=response.body()?.data?.timings?.Midnight.toString()
                    presenter.showResultPage()
                }
            })



        }
    fun fillDate(zone:String)
    {
        var currentTime=""
        val retrofit=Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://api.aladhan.com/v1/").build()

        val currentTimeInterface=retrofit.create(CurrentTimeInterface::class.java)
        currentTimeInterface.getCurrentTime(zone).enqueue(object :Callback<AladhanResponseCurrentTimeModel>{
            override fun onFailure(call: Call<AladhanResponseCurrentTimeModel>, t: Throwable) {
                Log.d("TAG",t.message)
            }

            override fun onResponse(
                call: Call<AladhanResponseCurrentTimeModel>,
                response: Response<AladhanResponseCurrentTimeModel>
            ) {
                currentTime=response.body()?.data.toString()
            }
        })



    }
    }
