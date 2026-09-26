package com.example.third

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.third.ui.theme.ThirdTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ThirdTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    UI_Work(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Preview (showBackground = true)
@Composable
fun GreetingPreview() {
    ThirdTheme {
        UI_Work()
    }
}

@Composable
fun UI_Work(modifier: Modifier = Modifier)
{
    val res = remember{mutableStateOf("")}
    Column {
        Row(
            modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Растение")
            TextField(
                value = res.value, onValueChange = { newText -> res.value = newText }
            )
        }
        Text("123")
    }
}