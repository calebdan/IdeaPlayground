package co.danjuma.ideaplayground.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ButtonComponent(value: String) {
    Button(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(10),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Blue,
            contentColor = Color.White
        ),
        onClick = { /*TODO*/ }) {

        Text(text = value)

    }
}


@Preview
@Composable
fun AppComponentPreview() {
    ButtonComponent(value = "test")
}