package co.danjuma.ideaplayground.screens


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import co.danjuma.ideaplayground.components.ButtonComponent
import co.danjuma.ideaplayground.R

@Composable
fun MainActivityScreen(navController: NavHostController) {

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(15.dp)) {


        Text(
            text = "List of small projects to navigate to",
            fontSize = 30.sp,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        Divider(thickness = 5.dp, color = Color.Black)

        Spacer(modifier = Modifier.height(20.dp))

        ButtonComponent(
            value = stringResource(id = R.string.tip_calculator),
            navController = navController, onClick = {
                navController.navigate("TipCalculatorScreen")
            }
        )

    }


}