package com.example.daggerhiltdemo.module.hilt

import android.content.Context
import com.example.daggerhiltdemo.module.model.Person
import com.example.daggerhiltdemo.module.modify.EnglishPerson2
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
 class Modular {
    @Provides
    @Singleton
     fun englishImpl(@ApplicationContext  context: Context): Person{
         return EnglishPerson2(context)
     }
}