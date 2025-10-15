package com.example.tp25

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivityHilt : AppCompatActivity() {

    @Inject lateinit var voitureHilt: VoitureHilt

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        println("=== With Hilt (automatic DI) ===")
        println(voitureHilt.conduire())
    }
}
