package com.example.aac_dagger.data

import com.example.aac_dagger.data.di.SampleRepository
import com.example.aac_dagger.data.di.SampleRepositoryImpl
import com.example.aac_dagger.data.di.DataSourceModule
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module(includes = [DataSourceModule::class])
abstract class RepositoryModule {
    @Singleton
    @Binds
    abstract fun bindRepository(repository: SampleRepositoryImpl): SampleRepository
}