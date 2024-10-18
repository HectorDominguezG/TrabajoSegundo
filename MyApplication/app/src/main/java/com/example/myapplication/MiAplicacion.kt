package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun MiAplicacion(){
    val context = LocalContext.current
    var texto by remember { mutableStateOf(context.getString(R.string.nopulsado)) }
    var pulsadoreset by remember { mutableStateOf(false) }
    var pulsadopulsar by remember { mutableStateOf(true) }
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            text = texto
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = {
                pulsadopulsar = false
                pulsadoreset = true
                texto = context.getString(R.string.pulsado)},
                enabled = pulsadopulsar,
                colors = ButtonColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    contentColor = MaterialTheme.colorScheme.primary,
                    disabledContainerColor = MaterialTheme.colorScheme.tertiaryContainer,
                    disabledContentColor =  MaterialTheme.colorScheme.onTertiary
                ),

                ) {
                Text(text = context.getString(R.string.botonpulsar))

            }
            Button(onClick = {
                pulsadoreset = false
                pulsadopulsar = true
                texto = context.getString(R.string.nopulsado)}, enabled = pulsadoreset){
                Text(text = context.getString(R.string.botonpulsar2))


            }
        }
    }

}