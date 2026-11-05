package com.example.series

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class InfoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                PantallaInfo(regresar = { finish() })
            }
        }
    }
}

@Composable
fun PantallaInfo(regresar: () -> Unit) {

    var imagenRes = R.drawable.ic_launcher_foreground
    var descripcion = ""


    if (personajeSeleccionado == "Yang Gwan-sik") {
        imagenRes = R.drawable.img
        descripcion = "Es un hombre trabajador, tranquilo, noble y leal. Demuestra su amor con acciones y siempre está dispuesto a apoyar a Ae-sun."
    } else if (personajeSeleccionado == "Oh Ae-sun") {
        imagenRes = R.drawable.img_1
        descripcion = "Es una mujer inteligente, soñadora, valiente y rebelde. A pesar de las dificultades, lucha por cumplir sus sueños y tener una vida mejor."
    } else if (personajeSeleccionado == "Park Yeong-bum") {
        imagenRes = R.drawable.img_2
        descripcion = "Es el primer amor de Geum-myeong. Es un joven que forma parte de su vida sentimental y representa una etapa importante en su historia."
    }


    else if (personajeSeleccionado == "Gye Su-jeong") {
        imagenRes = R.drawable.img_3
        descripcion = "Es una cirujana brillante, segura de sí misma y valiente. No se deja intimidar por las autoridades del hospital y siempre pone a sus pacientes primero."
    } else if (personajeSeleccionado == "Park Tae-kyung") {
        imagenRes = R.drawable.img_4
        descripcion = "Es un médico interno responsable, trabajador y dedicado. Al principio duda de Su-jeong, pero poco a poco reconoce su talento y aprende de ella."
    } else if (personajeSeleccionado == "Jang Hui-suk") {
        imagenRes = R.drawable.img_5
        descripcion = "UEs una mujer astuta, inteligente y decidida. Dirige una agencia de médicos y protege a Su-jeong, apoyándola en los momentos difíciles."
    }



    else if (personajeSeleccionado == "Yeon Si-eun") {
        imagenRes = R.drawable.img_6
        descripcion = "Estudiante callado y brillante que usa su intelecto, la física y su entorno para vencer la violencia escolar"
    } else if (personajeSeleccionado == "Ahn Su-ho") {
        imagenRes = R.drawable.img_7
        descripcion = "Peleador libre, fuerte y leal de artes marciales mixtas, que se convierte en el gran protector y amigo de Si-eun"
    } else if (personajeSeleccionado == "Geum Seong-je") {
        imagenRes = R.drawable.img_8
        descripcion = "Peleador callejero formidable, astuto y peligroso con un estilo de combate impredecible."
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {


        Image(
            painter = painterResource(id = imagenRes),
            contentDescription = personajeSeleccionado,
            modifier = Modifier
                .size(200.dp)
                .padding(bottom = 16.dp)
        )


        Text(
            text = personajeSeleccionado,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 12.dp)
        )


        Text(
            text = descripcion,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 24.dp)
        )


        Button(onClick = regresar) {
            Text("Regresar a Personajes")
        }
    }
}
