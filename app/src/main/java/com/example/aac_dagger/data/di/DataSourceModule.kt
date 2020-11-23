package com.example.aac_dagger.data.di

import com.example.aac_dagger.data.remote.SampleDataSource
import com.example.aac_dagger.data.remote.SampleDataSourceImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class DataSourceModule {
    @Singleton
    @Binds
    abstract fun provideDataSource(dataSource: SampleDataSourceImpl): SampleDataSource
}