package com.example.advancedandroidtask4.Retrofit

import com.example.advancedandroidtask4.Pojo.AladhanResponseCurrentTimeModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewCurrentTimeInterface {
    @GET("currentTime")
    fun getCurrentTime(@Query("zone")zone:String)

            : Call<AladhanResponseCurrentTimeModel>

}