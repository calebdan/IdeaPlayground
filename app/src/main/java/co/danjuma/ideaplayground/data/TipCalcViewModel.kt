package co.danjuma.ideaplayground.data

import android.app.Application
import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.LocalContext


import androidx.lifecycle.ViewModel
import co.danjuma.ideaplayground.components.ShowToast
import co.danjuma.ideaplayground.components.TextViewComponent
import co.danjuma.ideaplayground.screens.TipCalculatorScreen
import java.lang.NumberFormatException


class TipCalculatorViewModel : ViewModel() {

    private var tipCalcState = mutableStateOf(TipCalcState())


    fun onAction(action: TipCalcActions) {
        when (action) {

            is TipCalcActions.AmountEntered -> {
                tipCalcState.value = tipCalcState.value.copy(
                    tpValue = action.amountEntered
                )
            }

            is TipCalcActions.TCButtonClicked -> {

                try {
                    val tipPercentage = tipCalcState.value.tipPercentage

                    val billAmount = tipCalcState.value.tpValue.toInt()

                    val calcResult = billAmount * tipPercentage / 100

                    val tipResult = calcResult.toString()

                    Log.d("TipCalcViewModelResult", tipResult)

                    tipCalcState.value = tipCalcState.value.copy(

                        tipResult = tipResult
                    )
                } catch (e: NumberFormatException) {

                    // Toast.makeText(, "Provide a value",Toast.LENGTH_SHORT).show()

                }


            }

        }

    }

    val tipResult: String
        get() = tipCalcState.value.tipResult

}