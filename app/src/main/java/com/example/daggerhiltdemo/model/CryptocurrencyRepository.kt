package com.example.daggerhiltdemo.model

interface CryptocurrencyRepository {
    fun getCryptoCurrency(): List<Cryptocurrency>
}