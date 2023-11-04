package co.danjuma.ideaplayground.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import co.danjuma.ideaplayground.R
import co.danjuma.ideaplayground.components.ButtonComponent

@Composable
fun TipCalculatorScreen(navController: NavHostController) {
    Surface(
        modifier = Modifier
            .fillMaxSize()

    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp)
                .background(Color.White)
        ) {

            Text(text = "Tip Calculator Screen", fontSize = 30.sp)


            ButtonComponent(
                value = stringResource(id = R.string.tip_calculator_screen),
                navController = navController, onClick = {
                    navController.navigate("NewScreen")
                }
            )
        }


    }

}