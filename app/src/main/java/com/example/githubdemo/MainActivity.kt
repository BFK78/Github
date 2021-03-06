package com.example.githubdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.githubdemo.ui.theme.GithubDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GithubDemoTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.Blue)
                    ) {
                        Text(text = "yooo")
                        Text(text = "2Text View")
                        Text(text = "fdsfdsfds")
                        Text(text = "2Text View")
                        Text(text = "uo")
                        Text(text = "2Text View")
                        Text(text = "opfdfkd")
                        Text(text = "2Text View")
                        Text(text = "new new")
                        Text(text = "new new")
                        Text(text = "2Text View")
                        Text(text = "new new")
                        Text(text = "new new")


                    }
                }
            }
        }
    }
}

