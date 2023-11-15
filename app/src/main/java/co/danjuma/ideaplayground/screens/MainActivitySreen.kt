package co.danjuma.ideaplayground.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import co.danjuma.ideaplayground.components.ButtonComponent
import co.danjuma.ideaplayground.R
import co.danjuma.ideaplayground.components.TextViewComponent

@Composable
fun MainActivityScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ) {

        Card(
            elevation = CardDefaults.cardElevation(30.dp),
            modifier = Modifier
                .padding(10.dp)
                .padding(top = 20.dp)
                .fillMaxWidth()

        ) {
            Row() {

                Image(
                    modifier = Modifier
                        .size(
                            width = 90.dp,
                            90.dp
                        )
                        .clip(CircleShape),
                    imageVector = Icons.Filled.Person,
                    contentDescription = null,
                    contentScale = ContentScale.Fit,


                )
                
                Column(modifier = Modifier.padding(10.dp)) {
                    TextViewComponent(tcTextValue = "testing")

                    TextViewComponent(tcTextValue = "testing")

                    TextViewComponent(tcTextValue = "testing")
                }

            }
        }




        Text(
            text = "List of small projects to navigate to",
            fontSize = 30.sp,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(15.dp))

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