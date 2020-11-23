package com.example.aac_dagger.di.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.aac_dagger.di.viewmodel.util.ViewModelFactory
import com.example.aac_dagger.di.viewmodel.util.ViewModelKey
import com.example.aac_dagger.ui.main.MainViewModel
import com.example.aac_dagger.ui.main.SampleViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MainViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(value = MainViewModel::class)
    abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(value = SampleViewModel::class)
    abstract fun bindSampleViewModel(viewModel: SampleViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}