package com.example.de3mo



import android.icu.text.CaseMap
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import com.example.de3mo.ui.theme.De3moTheme

class new: ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            De3moTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar(
                            title = {Text("Go Habs Go")}
                        )
                    })
                { innerPadding ->
                    Greeting4(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting4(name: String, modifier: Modifier) {
    Column(
modifier = modifier
    ){
        Box(
            modifier= Modifier.weight(.1f).fillMaxWidth().background((Color.Red))

        ){}
        Box(
            modifier= Modifier.weight(.1f).fillMaxWidth(),
            contentAlignment = Alignment.Center

        ){

            Box(
                modifier= Modifier
                    .height(160.dp)
                    .fillMaxWidth()
                    .background((Color.Blue)),
                contentAlignment = Alignment.Center


            ){
                Button(
                    modifier = Modifier,
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Gray, contentColor = Color.White)

                ) {
                    Text(text = "ET LE BUUUUUUUUT !!!")
                }

            }
        }

        Box(
            modifier= Modifier.weight(.1f).fillMaxWidth().background((Color.Red))

        ){}

    }
}

