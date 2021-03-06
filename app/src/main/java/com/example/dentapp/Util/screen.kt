package com.example.dentapp.Util

sealed class Screen(val route: String) {
        object WelcomeScreen : Screen("welcome_screen")
        object DiagnosisScreen : Screen("diagnosis_screen")
        object PenyakitScreen : Screen("penyakit_screen")
        object GejalaScreen : Screen("gejala_screen")
        object PetunjukScreen : Screen("petunjuk_screen")
        object TentangScreen : Screen("tentang_screen")


}
