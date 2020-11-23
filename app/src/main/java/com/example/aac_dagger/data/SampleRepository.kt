package com.example.aac_dagger.data

import com.example.aac_dagger.data.remote.SampleDataSource
import javax.inject.Inject

interface SampleRepository {
    fun getWelcomeText(): String
}

class SampleRepositoryImpl @Inject constructor(
    private val sampleDataSource: SampleDataSource
) : SampleRepository {
    override fun getWelcomeText(): String = sampleDataSource.getWelcomeText()
}