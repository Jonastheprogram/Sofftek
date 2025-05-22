package br.com.fiap.biotrack.Screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.softmind.R


@Composable
fun DashboardScreen(navController: NavController

) {
    Column(

        modifier = Modifier
            .background(color = Color(0xFF71A8CE))
            .fillMaxSize()
            .padding(top = 30.dp),

        verticalArrangement = Arrangement.spacedBy(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Text(
            text = stringResource(id = R.string.mesdodash),
            style = MaterialTheme.typography.headlineLarge,
            color = Color(0xFF000000),
            fontSize = 25.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Card (
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFFFFFFF) // Cor de fundo do Card
            ),
            modifier = Modifier.padding(16.dp)
                .fillMaxWidth()
        ){
            Text(
                text = stringResource(id = R.string.emoção),
                style = MaterialTheme.typography.headlineLarge,
                color = Color(0xFF000000),
                fontSize = 25.sp
            )

        }

        Spacer(modifier = Modifier.height(30.dp))

        Row(

            horizontalArrangement = Arrangement.spacedBy(30.dp)

        )

        {

            Button(
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50)),
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier
                    .size(130.dp),

                onClick = { navController.navigate("reg_avistamento") }
            ) {
                Text(
                    text = stringResource(id = R.string.reg_avistamento)
                )
            }


            Button(
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50)),
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier
                    .size(130.dp),
                onClick = {navController.navigate("maps")}
            ) {
                Text(
                    text = stringResource(id = R.string.mapA)
                )
            }
        }


        Row (

            horizontalArrangement = Arrangement.spacedBy(30.dp)

        ){

            Button(
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50)),
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier
                    .size(135.dp),
                onClick = {navController.navigate("reg_avistamento")} )
            {
                Text(text = stringResource(id = R.string.list_avistamento))
            }

            Button(
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50)),
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier
                    .size(135.dp),
                onClick = {navController.navigate("configs")})
            {
                Text(
                    text = stringResource(id = R.string.config),
                    fontSize = 13.sp
                )
            }
        }






    }
}



@Preview(showBackground = true)
@Composable
fun PreviewDashboardScreen() {
    DashboardScreen(rememberNavController())
}
