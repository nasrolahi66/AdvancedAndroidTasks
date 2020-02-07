package com.example.session3task

import android.util.Log


public  fun Int.secondToHour():Int
    {
        if (this<36_000) return 0
        return  this/36_000
    }

    public fun String.summrize():String
    {
        if(this.length<50) return  this
        return this.substring(0,50) + "..."
    }







