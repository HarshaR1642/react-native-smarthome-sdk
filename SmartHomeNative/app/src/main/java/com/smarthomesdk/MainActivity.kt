package com.smarthomesdk

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.LocalActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { App() }
    }
}

@Composable
fun App() {
  val activity = LocalActivity.current

  Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
    Button(
      colors = ButtonDefaults.buttonColors().copy(containerColor = Color.Black),
      onClick = {
        val intent = Intent(activity, SDKMainActivity::class.java)
        activity?.startActivity(intent)
      }) {
      Text("Open Smart Home")
    }
  }
}
