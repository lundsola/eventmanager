package com.lundsola.eventmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.lundsola.eventmanager.ui.MainScreen
import dagger.hilt.android.AndroidEntryPoint

/**
 * Main activity for the app.
 */
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}
