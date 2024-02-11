package com.example.tp_qcm_yun

sealed class Screen (val itineraire : String){
    object AccueilScreen : Screen("accueil_screen")
    object QcmScreen : Screen("qcm_screen")
}