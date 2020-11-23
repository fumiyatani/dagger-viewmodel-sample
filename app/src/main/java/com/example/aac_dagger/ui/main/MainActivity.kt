package com.example.aac_dagger.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.aac_dagger.R
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val mainViewModel: MainViewModel by viewModels {
        viewModelFactory
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        setupViews()
    }

    private fun setupViews() {
        mainViewModel.welcomeText.observe(this) {
            findViewById<TextView>(R.id.welcome_text).text = it
        }

        findViewById<Button>(R.id.next_button).setOnClickListener {
        }
    }
}