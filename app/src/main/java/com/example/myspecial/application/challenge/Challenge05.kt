package com.example.myspecial.application.challenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myspecial.application.R
import com.example.myspecial.application.ui.theme.MySpecialApplicationTheme

@Composable
fun MyComposable() {
    Column(
        modifier = Modifier.fillMaxSize(),
        // choose the correct alignments
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            modifier = Modifier
                .height(400.dp)
                .padding(16.dp),
            contentScale = ContentScale.Crop,
            contentDescription = "App logo"
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            // choose the correct alignments
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = Icons.Filled.ShoppingCart, // choose the correct icon
                contentDescription = "Shopping cart icon",
            )
            Text(
                text = "Free shipping on all orders",
                modifier = Modifier.padding(8.dp),
            )
        }
        Button(
            modifier = Modifier.fillMaxWidth().padding(16.dp).padding(horizontal = 8.dp), // should expand horizontally and have padding
            onClick = { /* Ignore */ }
        ) {
            Text(
                text = "Let's Go",
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.headlineMedium
            )
        }
    }
}

@Preview(showBackground = true, device = Devices.PIXEL_7_PRO)
@Composable
fun MyComposablePreview() {
    MySpecialApplicationTheme {
        MyComposable()
    }
}
