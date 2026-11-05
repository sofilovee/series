package com.example.series

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlin.jvm.java

var serieSeleccionada = ""
var personajeSeleccionado = ""
class SerieActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme{
                MenuSeries(
                    abrirPersonajes = {
                        startActivity(Intent(this, PersonajeActivity::class.java))
                    }
                )
            }
        }
    }
}

@Composable
fun MenuSeries(abrirPersonajes: () -> Unit){
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Elige una serie", style = MaterialTheme.typography.headlineMedium)

        Button(
            onClick = {
                serieSeleccionada= "Si la vida te da mandarinas"
                abrirPersonajes()
            },
            modifier = Modifier.fillMaxWidth().padding(top = 24.dp)
        ) {
            Text("Si la vida te da mandarinas")
        }

        Button(
            onClick = {
                serieSeleccionada = "Doctora x"
                abrirPersonajes()
            },
            modifier = Modifier.fillMaxWidth().padding(top = 12.dp)
        ){
            Text("Doctora x")
        }

        Button(
            onClick = {
                serieSeleccionada = "Un héroe débil"
                abrirPersonajes()
            },
            modifier = Modifier.fillMaxWidth().padding(top = 12.dp)
        ) {
            Text("Un héroe debil")
        }
    }
}

