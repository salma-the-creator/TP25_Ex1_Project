package com.example.tp25

import javax.inject.Inject

class ReservoirHilt @Inject constructor(private val carburant: CarburantHilt) {
    fun verifierNiveau(): String = "Niveau OK, type de carburant : ${carburant.typeDeCarburant()}"
}
