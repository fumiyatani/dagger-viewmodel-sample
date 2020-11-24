package com.example.aac_dagger.di

import android.content.Context
import com.example.aac_dagger.MyApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [
    ActivityModule::class,
    AndroidInjectionModule::class,
    AppModule::class])
interface AppComponent : AndroidInjector<MyApplication> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): AppComponent
    }
}
