package com.example.ejerciciolayouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejerciciolayouts.ui.theme.EjercicioLayoutsTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EjercicioLayoutsTheme {
                Scaffold(modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar(
                            title = { Text("Mi app") }
                        )
                    }) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Layouts()
}

@Composable
fun Layouts() {
    Row(Modifier.fillMaxSize()) {
        Spacer(Modifier.width(5.dp))
        Columna(Modifier.weight(1f), Modifier.weight(0.3f))
        Spacer(Modifier.width(5.dp))
        Columna(Modifier.weight(0.8f), Modifier.weight(0.1f))
        Spacer(Modifier.width(5.dp))
        Columna(Modifier.weight(1f), Modifier.weight(0.4f))
        Spacer(Modifier.width(5.dp))
    }
}


@Composable
fun Columna(ancho: Modifier, alto: Modifier) {
    Column(
        ancho
    ) {
        Box(
            Modifier
                .fillMaxWidth()
                .background(Color(red = 255,  green = 192, blue = 203))
                .weight(1f), contentAlignment = Alignment.Center

        ) {
            Text("View")
        }
        Box(
            alto
                .fillMaxWidth()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EjercicioLayoutsTheme {
        Greeting("Android")
    }
}