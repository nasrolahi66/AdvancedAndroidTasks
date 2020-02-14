package com.example.advancedandroidtask4.Retrofit


import com.example.advancedandroidtask4.Pojo.AladhanResponseModel
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Call

interface TimesInterface {
    @GET("timingsByCity")
    fun getTimings(@Query("city")city:String,
                   @Query("country")country:String,
                   @Query("method")method:Int):
                   Call<AladhanResponseModel>

}