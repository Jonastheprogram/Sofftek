package br.com.fiap.softmind.Screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class MoodViewModel {

    var selectedMood by mutableStateOf<String?>(null)
        private set

    fun setMood(mood: String) {
        selectedMood = mood
    }
}