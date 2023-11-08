package co.danjuma.ideaplayground.screens

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import co.danjuma.ideaplayground.components.ButtonComponent
import co.danjuma.ideaplayground.components.TextFieldComponent
import co.danjuma.ideaplayground.components.TextViewComponent
import co.danjuma.ideaplayground.data.TipCalcActions
import co.danjuma.ideaplayground.data.TipCalcState
import co.danjuma.ideaplayground.data.TipCalculatorViewModel
import co.danjuma.ideaplayground.ui.theme.OffWhite

@Composable
fun TipCalculatorScreen(navController: NavHostController) {

    val focusManager = LocalFocusManager.current

    val tcViewModel: TipCalculatorViewModel = viewModel()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(OffWhite),
        contentAlignment = Alignment.BottomCenter
    ) {
        Column(

            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
                .pointerInput(Unit) {
                    detectTapGestures(onTap = {
                        focusManager.clearFocus()
                    })
                }) {

            Text(text = "Tip Calculator Screen", fontSize = 30.sp)

            Spacer(modifier = Modifier.height(15.dp))

            TextFieldComponent("") {
                tcViewModel.onAction(TipCalcActions.AmountEntered(it))
            }

            Spacer(modifier = Modifier.height(15.dp))



            TextViewComponent("") { it ->

            }

            Spacer(modifier = Modifier.height(25.dp))

            ButtonComponent(

                value = "Calculate",
                navController = navController,
                onClick = {

                    tcViewModel.onAction(TipCalcActions.TCButtonClicked)

                },
            )


        }
        ButtonComponent(

            value = "Go Back", navController = navController, onClick = {
                navController.navigate("MainActivityScreen")
            })

    }

}

@Preview
@Composable
fun TipCalcPreview() {

}