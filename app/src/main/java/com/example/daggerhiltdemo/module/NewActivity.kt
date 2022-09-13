package com.example.daggerhiltdemo.module

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerhiltdemo.R
import com.example.daggerhiltdemo.module.model.Person
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class NewActivity : AppCompatActivity() {


//    @Inject
//    lateinit var englishPerson: EnglishPerson

    //when we have call different object in same
//    @Inject
    lateinit var spanishPerson: SpanishPerson

    @Inject
    lateinit var speakPerson:Person
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
//        englishPerson.speakEnglish()
//        spanishPerson.speakSpanish()
//        spanishPerson.englishPerson.speakEnglish()
       speakPerson.speakLanguage("1")
    }
}