package co.danjuma.ideaplayground.data

import androidx.compose.runtime.mutableStateOf


import androidx.lifecycle.ViewModel


class TipCalculatorViewModel : ViewModel() {

    var tipCalcState = mutableStateOf(TipCalcState())

    fun onAction(action: TipCalcActions) {
        when (action) {

            is TipCalcActions.AmountEntered -> {
                tipCalcState.value = tipCalcState.value.copy(
                    tpValue = action.amountEntered
                )
            }

            is TipCalcActions.tcButtonClicked ->{


            }


        }
    }


}