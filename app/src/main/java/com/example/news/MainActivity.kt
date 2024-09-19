package com.example.news

import News
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.news.ui.theme.NewsTheme
import MainWindow


class MainActivity : ComponentActivity() {
    private val viewModel: News by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsTheme {
                MainWindow(viewModel)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NewsTheme() {
        val viewModel = News()
        MainWindow(viewModel)
    }
}

