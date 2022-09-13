package com.example.daggerhiltdemo.module

import android.content.Context
import android.util.Log
import android.widget.Toast
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class SpanishPerson @Inject constructor(
    @ApplicationContext var context: Context,
    val englishPerson: EnglishPerson
) {
    fun speakSpanish() {
        Toast.makeText(context, "Spanish", Toast.LENGTH_SHORT).show()
    }
}