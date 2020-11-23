package com.example.aac_dagger.di.viewmodel

import androidx.lifecycle.ViewModel
import com.example.aac_dagger.di.viewmodel.util.ViewModelFactoryModule
import com.example.aac_dagger.di.viewmodel.util.ViewModelKey
import com.example.aac_dagger.ui.main.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [ViewModelFactoryModule::class])
abstract class MainViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(value = MainViewModel::class)
    abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel
}