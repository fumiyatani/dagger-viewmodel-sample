package com.example.aac_dagger.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.aac_dagger.data.di.SampleRepository
import javax.inject.Inject

@Suppress("CanBeParameter")
class MainViewModel @Inject constructor(
    private val sampleRepository: SampleRepository
) : ViewModel() {

    private val _welcomeText: MutableLiveData<String> = MutableLiveData()
    val welcomeText: LiveData<String> = _welcomeText

    init {
        _welcomeText.value = sampleRepository.getWelcomeText()
    }
}