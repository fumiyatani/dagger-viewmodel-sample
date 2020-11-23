package com.example.aac_dagger.di

import android.content.Context
import com.example.aac_dagger.MyApplication
import com.example.aac_dagger.data.RepositoryModule
import com.example.aac_dagger.di.viewmodel.MainActivityModule
import com.example.aac_dagger.di.viewmodel.util.ViewModelFactoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [
    MainActivityModule::class,
    ViewModelFactoryModule::class,
    AndroidInjectionModule::class,
    RepositoryModule::class])
interface AppComponent : AndroidInjector<MyApplication> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): AppComponent
    }
}
