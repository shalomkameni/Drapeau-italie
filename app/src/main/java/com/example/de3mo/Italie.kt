package com.example.de3mo



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.de3mo.ui.theme.De3moTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            De3moTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting2(
                        name = "David",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
    Row(
        modifier = modifier.fillMaxWidth()
    ) {
        Column(
            Modifier.weight(1f).fillMaxHeight().background(Color.Green)
        ) { }
        Column(
            Modifier.weight(1f).fillMaxHeight().background(Color.White)
        ) { }
        Column(
            Modifier.weight(1f).fillMaxHeight().background(Color.Red)
        ) { }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    De3moTheme {
        Greeting2("David")
    }
}