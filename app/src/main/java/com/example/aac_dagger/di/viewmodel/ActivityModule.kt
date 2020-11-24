package com.example.aac_dagger.di.viewmodel

import com.example.aac_dagger.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(
            modules = [FragmentModule::class]
    )
    abstract fun activity(): MainActivity

}