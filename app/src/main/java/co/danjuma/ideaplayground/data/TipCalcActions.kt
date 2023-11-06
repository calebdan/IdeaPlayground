package co.danjuma.ideaplayground.data

sealed class TipCalcActions {
    data class AmountEntered(val amountEntered: String): TipCalcActions()


    object tcButtonClicked:TipCalcActions()
}