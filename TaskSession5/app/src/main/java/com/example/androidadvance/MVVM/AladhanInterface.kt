package com.example.androidadvance.MVVM

import java.util.*
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query


interface AladhanInterface {
    @GET("timingsByCity")
    fun getAzan(@Query("city")city:String,@Query("country")country:String,@Query("method")method:Int)
            : Observable<AladhanResponseModel>
}