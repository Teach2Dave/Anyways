package com.cb.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cb.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SelectorScreen()
                }
            }
        }
    }
}

@Composable
private fun SelectorScreen() {
    val localContext = LocalContext.current
    LazyColumn(Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        item {
            FeatureItem("Legacy Dress Activity") {
                val intent = Intent(localContext, DressActivity::class.java)
                localContext.startActivity(intent)
            }
            FeatureItem("Compose Dress Activity") {
                val intent = Intent(localContext, ComposeDressDetailActivity::class.java)
                localContext.startActivity(intent)
            }
        }
    }
}
@Composable
private fun FeatureItem(name: String, onClick: () -> Unit) {
    Button(onClick, Modifier.fillMaxWidth().padding(horizontal = 16.dp)) {
        Text(text = name, fontWeight = FontWeight.Bold)
    }
}

@Preview
@Composable
private fun Preview_SelectorScreen() {
    SelectorScreen()
}