package com.example.daggerhiltdemo.module

import android.content.Context
import android.util.Log
import android.widget.Toast
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class EnglishPerson @Inject constructor(@ApplicationContext val context:Context) {
    fun speakEnglish(){
        Toast.makeText(context, "English", Toast.LENGTH_SHORT).show()
    }
}