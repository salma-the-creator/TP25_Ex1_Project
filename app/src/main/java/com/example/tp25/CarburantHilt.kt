package com.example.tp25

import javax.inject.Inject

class CarburantHilt @Inject constructor() {
    fun typeDeCarburant(): String = "Essence (Hilt)"
}
