package com.example.aac_dagger.data.remote

import javax.inject.Inject

interface SampleDataSource {
    fun getWelcomeText(): String
}

class SampleDataSourceImpl @Inject constructor() : SampleDataSource {
    override fun getWelcomeText(): String = "welcome to AAC-Dagger!!"
}