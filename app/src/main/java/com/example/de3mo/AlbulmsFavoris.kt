package com.example.de3mo



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.de3mo.ui.theme.De3moTheme

class AlbulmsFavoris : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            De3moTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting6(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting6(name: String, modifier: Modifier = Modifier) {
    val patentes = listOf<String>(
        "Antigéographiquement",
        "J'ai Bu",
        "Comment Debord",
        "Darlène",
        "La nuit Est Une Panthère",
        "Jaune"
    )
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()

    ) {

        // qu'on parcourt avec une boucle
        for (patente in patentes) {
            // on ajoute un item à la liste
            item {
                Machin(name = patente, modifier = Modifier.padding(8.dp).height(150.dp))
            }
        }
    }


   }
@Composable
fun Machin(name: String, modifier: Modifier) {

    Box(
        modifier = modifier.fillMaxWidth(),
        contentAlignment = Alignment.CenterStart
    ) {
        Text(text = name)
    }
}



    @Composable
    fun GreetingPreview6() {
        De3moTheme {
            Greeting6("Android")
        }
    }


