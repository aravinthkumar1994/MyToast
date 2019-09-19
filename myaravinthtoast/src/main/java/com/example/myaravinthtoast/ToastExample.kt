package com.example.myaravinthtoast

import android.content.Context
import android.widget.Toast

class SimpleToast {
    var context:Context?=null

    fun init(context:Context)
    {
        this.context=context
    }

    fun ToastShort(message:String)
    {
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show()

    }
    fun ToastLong(message:String)
    {
        Toast.makeText(context,message,Toast.LENGTH_LONG).show()
    }

}