package com.example.tp25

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivityNoHilt : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // No layout - simple console output for TP
        val carburant = Carburant()
        val reservoir = Reservoir(carburant)
        val moteur = Moteur()
        val voiture = Voiture(moteur, reservoir)

        println("=== Without Hilt (manual DI) ===")
        println(voiture.conduire())
    }
}
