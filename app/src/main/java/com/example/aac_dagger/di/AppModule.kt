package com.example.aac_dagger.di

import com.example.aac_dagger.data.SampleRepository
import com.example.aac_dagger.data.SampleRepositoryImpl
import com.example.aac_dagger.data.remote.SampleDataSource
import com.example.aac_dagger.data.remote.SampleDataSourceImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class AppModule {
    @Singleton
    @Binds
    abstract fun provideDataSource(dataSource: SampleDataSourceImpl): SampleDataSource

    @Singleton
    @Binds
    abstract fun bindRepository(repository: SampleRepositoryImpl): SampleRepository
}