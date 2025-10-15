package com.example.tp25

class Voiture(private val moteur: Moteur, private val reservoir: Reservoir) {
    fun conduire(): String {
        val demarrage = moteur.demarrer()
        val niveau = reservoir.verifierNiveau()
        return "$demarrage\n$niveau\nLa voiture est en route 🚗"
    }
}
