package com.example.daggerhiltdemo.module.modify

import android.content.Context
import android.widget.Toast
import com.example.daggerhiltdemo.module.model.Person
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class EnglishPerson2 @Inject constructor(@ApplicationContext var context: Context):Person {
    override fun speakLanguage(userID:String):String {
        Toast.makeText(context, "Both Language", Toast.LENGTH_SHORT).show()
        if(userID.equals(""))
        {

        }
        return "1"
    }
}