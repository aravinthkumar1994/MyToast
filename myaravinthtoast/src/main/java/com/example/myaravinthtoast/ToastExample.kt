package com.example.myaravinthtoast

import android.content.Context
import android.widget.Toast

class ToastExample {

    fun aravinthToast(c:Context,message:String)
    {
        Toast.makeText(c,message,Toast.LENGTH_SHORT).show()

    }
}