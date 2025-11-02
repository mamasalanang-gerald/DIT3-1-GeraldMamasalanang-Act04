package com.example.eventpracticeapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.eventpracticeapp.ui.theme.EventPracticeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EventPracticeAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    EventScreen()
                }
            }
        }
    }
}

@Composable
fun EventScreen() {
    var name by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    var output by remember { mutableStateOf("") }
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Name") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = age,
            onValueChange = { age = it },
            label = { Text("Age") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                if (name.isBlank() || age.isBlank()) {
                    Toast.makeText(context, "Please fill in all fields.", Toast.LENGTH_SHORT).show()
                } else {
                    try {
                        val ageInt = age.toInt()
                        output = "Name: $name, Age: $ageInt"
                    } catch (e: NumberFormatException) {
                        Toast.makeText(context, "Please enter a valid age.", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        ) {
            Text("Submit")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = output)
    }
}

@Preview(showBackground = true)
@Composable
fun EventScreenPreview() {
    EventPracticeAppTheme {
        EventScreen()
    }
}
