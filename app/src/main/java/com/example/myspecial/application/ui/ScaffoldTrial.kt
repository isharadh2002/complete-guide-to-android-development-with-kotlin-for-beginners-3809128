package com.example.myspecial.application.ui

import android.os.*
import androidx.activity.*
import androidx.activity.compose.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.*
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.res.*
import androidx.compose.ui.text.font.*
import androidx.compose.ui.text.style.*
import androidx.compose.ui.tooling.preview.*
import androidx.compose.ui.unit.*
import com.example.myspecial.application.R
import com.example.myspecial.application.ui.theme.*

class ScaffoldTrial : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                ScaffoldExample()
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldExample() {
    var presses by remember { mutableIntStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text(stringResource(R.string.app_bar_title))
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.primary,
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = "Bottom app bar",
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { presses++ }) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {

            Greeting("Android!!!", Modifier)
            Text(
                modifier = Modifier.padding(10.dp),
                text =
                """
                    This is an example of a scaffold. It uses the Scaffold composable's parameters to create a screen with a simple top app bar, bottom app bar, and floating action button.

                    It also contains some basic inner content, such as this text.

                    You have pressed the floating action button $presses times.
                """.trimIndent(),
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Justify
            )
        }
    }
}

@Preview(
    showBackground = true,
    device = Devices.PIXEL_7_PRO
)

@Composable
fun ScaffoldExamplePreview() {
    AppTheme {
        ScaffoldExample()
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier){
    Column (
        modifier = modifier.fillMaxWidth()
    ){
        Text(
            modifier = modifier.align(Alignment.CenterHorizontally)
                .padding(top = 30.dp, bottom = 5.dp, start = 10.dp, end = 10.dp)
                .fillMaxWidth()
                .clickable {  },
            text = "Hello $name",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Light,
            color = MaterialTheme.colorScheme.tertiary,
            textAlign = TextAlign.Center
        )

    }
}

@Preview(
    showBackground = true,
    device = Devices.PIXEL_7_PRO
)
@Composable
fun GreetingPreview() {
    MySpecialApplicationTheme {
        Greeting("Android", Modifier)
    }
}