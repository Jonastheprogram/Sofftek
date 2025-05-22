package br.com.fiap.softmind.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.biotrack.Screens.DashboardScreen

@Composable
fun MoodSelectionScreen(navController: NavController, viewModel: MoodViewModel) {
    Column (Modifier
        .fillMaxSize()
        .background(
            brush = Brush.linearGradient(
                colors = listOf(Color(0xFFB5EAD7), Color(0xFF639BCD)) // verde -> verde claro
            )

    ) ){

        Column {


            Button(onClick = {
                viewModel.setMood("motivado")
                navController.navigate("moodDisplay")
            }) {
                Text("Escolher 'Motivado'")
            }

            Button(onClick = {
                viewModel.setMood("cansado")
                navController.navigate("moodDisplay")
            }) {
                Text("Escolher 'Cansado'")
            }

        }

    }


}

@Preview(showBackground = true)
@Composable
fun MoodSelectionScreenPreview() {
    val fakeNavController = rememberNavController()
    val fakeViewModel = MoodViewModel()

    MoodSelectionScreen(
        navController = fakeNavController,
        viewModel = fakeViewModel
    )
}
