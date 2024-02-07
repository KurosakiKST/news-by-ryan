package com.ryan.news.feature.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ryan.news.presentation.nav.Route
import com.ryan.news.presentation.view.ui.theme.NewsTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        setContent {
            NewsByRyanApp()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewsByRyanApp() {
    Route()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NewsTheme {
        NewsByRyanApp()
    }
}