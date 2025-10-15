package com.example.tp25

import javax.inject.Inject

class MoteurHilt @Inject constructor() {
    fun demarrer(): String = "Le moteur démarre... (Hilt)"
}
