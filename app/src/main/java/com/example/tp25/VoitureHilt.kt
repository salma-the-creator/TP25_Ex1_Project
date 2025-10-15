package com.example.tp25

import javax.inject.Inject

class VoitureHilt @Inject constructor(
    private val moteur: MoteurHilt,
    private val reservoir: ReservoirHilt
) {
    fun conduire(): String = "${moteur.demarrer()}\n${reservoir.verifierNiveau()}\nLa voiture est en route 🚗 (Hilt)"
}
