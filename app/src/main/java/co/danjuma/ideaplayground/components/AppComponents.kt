package co.danjuma.ideaplayground.components


import android.sax.TextElementListener
import android.widget.Toast
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusEvent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import co.danjuma.ideaplayground.R


@Composable
fun ButtonComponent(

    value: String,
    navController: NavController,
    onClick: () -> Unit,

    ) {
    Button(

        modifier = Modifier
            .fillMaxWidth()
            .border(
                1.dp, color = Color.Blue,
                shape = RectangleShape
            )
            .padding(
                horizontal = 5.dp,
                vertical = 2.dp
            ),
        shape = RoundedCornerShape(10),

        onClick = {
            onClick()
        }) {

        Text(
            text = value, fontSize = 15.sp, fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center
        )

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldComponent(value: String, onTextEntered: (String) -> Unit) {
    var textValue = remember { mutableStateOf(value) }

    TextField(

        value = textValue.value,
        onValueChange = {
            textValue.value = it
            onTextEntered(it)
        },
        maxLines = 1,
        singleLine = true,


        textStyle =
        androidx.compose.ui.text.TextStyle(
            fontSize = 20.sp,
            textDecoration = TextDecoration.Underline
        ),

        label = {
            Text(
                text = stringResource(id = R.string.purchase_amount),
                fontSize = 10.sp
            )
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun ShowToast() {
    Toast.makeText(LocalContext.current, "Provide a value", Toast.LENGTH_SHORT).show()
}

@Composable
fun TextViewComponent(tcTextValue: String) {

    var textValue = remember { mutableStateOf(tcTextValue) }

    Text(

        text = tcTextValue,
        fontSize = 20.sp,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.Center,

        )
}


@Preview
@Composable
fun AppComponentPreview() {
    val navController = rememberNavController()

    Column(modifier = Modifier.fillMaxSize()) {

        TextFieldComponent("", {})

        ButtonComponent(value = "test", navController, {})
    }


}