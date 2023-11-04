package co.danjuma.ideaplayground.components


import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun ButtonComponent(value: String, navController: NavController? = null, onClick: () -> Unit) {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .border(
                1.dp, color = Color.Blue,
                shape = RectangleShape
            )
            .padding(horizontal = 5.dp, vertical = 2.dp),
        shape = RoundedCornerShape(10),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Blue,
            contentColor = Color.White

        ),
        onClick = {
            if (navController != null) {
                navController.navigate("MainActivityScreen")
            } else {
                // Otherwise, simply call the onClick listener
                onClick()
            }
        }) {

        Text(
            text = value, fontSize = 20.sp, fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center
        )

    }
}


@Preview
@Composable
fun AppComponentPreview() {
    val navController = rememberNavController()
    ButtonComponent(value = "test", navController, {})
}