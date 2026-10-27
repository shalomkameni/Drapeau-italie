package com.example.de3mo



import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.unit.dp
import com.example.de3mo.ui.theme.De3moTheme

class Champsduneclasse : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            De3moTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting7(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun Greeting7(name: String, modifier: Modifier = Modifier) {
    val Albums =  listOf(
        Album(1, "Antigéographiquement", "Jêrome 50"),
        Album(2, "J'ai Bu", "Quéec Redneck"),
        Album(3, "Comment Debord", "Comment Debord"),
        Album(4, "Darlène", "Hubert Lenoir"),
        Album(5, "La Nuit Est Une Panthère", "Les Louanges"),
        Album(6, "Jaune", "Jean-Pierre Ferland")
    )
    LazyColumn(
        modifier = modifier
            .fillMaxSize()

    ) {

        // qu'on parcourt avec une boucle
        for (album in Albums) {
            // on ajoute un item à la liste
            item {
                Machin1(album = album, modifier = Modifier.padding(8.dp).height(150.dp))
            }
        }
    }


}





@Composable
fun Machin1(album: Album, modifier: Modifier) {

    Column (
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center
    ) {

        Text(text =  album.name)
        Text(text = "${album.artistName}")
    }
}
data class Album(
    val id: Int,
    val name: String,
    val artistName: String
)


@Composable
fun GreetingPreview7() {
    De3moTheme {
        Greeting6("Android")
    }
}




