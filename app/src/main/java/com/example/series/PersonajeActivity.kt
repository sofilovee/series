package com.example.series

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlin.jvm.java

class PersonajeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                PantallaPersonajes(
                    abrirInfo = {
                        startActivity(Intent(this, InfoActivity::class.java))
                    },
                    regresar = { finish() }
                )
            }
        }
    }
}

@Composable
fun PantallaPersonajes(abrirInfo: () -> Unit, regresar: () -> Unit){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Personajes de $serieSeleccionada",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(24.dp))
        if (serieSeleccionada == "Si la vida te da mandarinas") {
            Button(
                onClick = {
                    personajeSeleccionado = "Yang Gwan-sik"
                    abrirInfo()
                },
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
            ) {
                Text("Yang Gwan-sik")
            }

            Button(
                onClick = {
                    personajeSeleccionado = "Oh Ae-sun"
                    abrirInfo()
                },
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
            ) {
                Text("Oh Ae-Sun")
            }

            Button(
                onClick = {
                    personajeSeleccionado = "Park Yeong-bum"
                    abrirInfo()
                },
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
            ) {
                Text("Park Yeong-bum")
            }
        } else if (serieSeleccionada == "Doctora x") {
            Button(
                onClick = {
                    personajeSeleccionado = "Gye Su-jeong"
                    abrirInfo()
                },
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
            ) {
                Text("Gye Su-jeong")
            }

            Button(
                onClick = {
                    personajeSeleccionado = "Park Tae-kyung"
                    abrirInfo()
                },
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
            ) {
                Text("Park Tae-kyung")
            }

            Button(
                onClick = {
                    personajeSeleccionado = "Jang Hui-suk"
                    abrirInfo()
                },
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
            ) {
                Text("Jang Hui-suk")
            }
        } else if (serieSeleccionada == "Un héroe débil") {
            Button(
                onClick = {
                    personajeSeleccionado = "Yeon Si-eun"
                    abrirInfo()
                },
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
            ) {
                Text("Yeon Si-eun")
            }

            Button(
                onClick = {
                    personajeSeleccionado = "Ahn Su-ho"
                    abrirInfo()
                },
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
            ) {
                Text("Ahn Su-ho")
            }

            Button(
                onClick = {
                    personajeSeleccionado = "Geum Seong-je"
                    abrirInfo()
                },
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)
            ) {
                Text("Geum Seong-je")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))


        Button(onClick = regresar) {
            Text("Regresar a Series")
        }
    }
}
