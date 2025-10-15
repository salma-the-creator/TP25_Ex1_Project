package com.example.tp25

class Reservoir(private val carburant: Carburant) {
    fun verifierNiveau(): String {
        return "Niveau OK, type de carburant : ${carburant.typeDeCarburant()}"
    }
}
