package com.example.two.trees.ui.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myspecial.application.R
import com.example.two.trees.TwoTreesApp
import com.example.two.trees.ui.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TwoTreesAppBar() {
    TopAppBar(
        title = {
            Text(stringResource(R.string.app_name))
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = MaterialTheme.colorScheme.onPrimary,
            navigationIconContentColor = MaterialTheme.colorScheme.onPrimary
        ),
        navigationIcon = {
            Icon(
                painter = painterResource(R.drawable.ic_logo),
                contentDescription = null
            )
        }
    )
}

@Composable
fun TwoTreesBottomAppBar() {
    BottomAppBar(
        containerColor = MaterialTheme.colorScheme.primaryContainer,
        contentColor = MaterialTheme.colorScheme.onPrimaryContainer
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            text = "Bottom app bar",
        )
    }
}

@Preview(
    showBackground = true,
    device = Devices.PIXEL_7_PRO,
    name = "Pixel 7 Pro"
)

@Composable
fun TwoTreesAppBarPreview() {
    AppTheme {
        Scaffold(
            modifier = Modifier.fillMaxWidth(),
            topBar = {
                TwoTreesAppBar()
            },
            bottomBar = {
                TwoTreesBottomAppBar()
            }
        ) { innerPadding ->

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Hello"
                )
            }
        }
    }
}