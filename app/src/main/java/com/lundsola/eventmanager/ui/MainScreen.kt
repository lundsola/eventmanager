package com.lundsola.eventmanager.ui

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

/**
 * Main navigation and screen host.
 */
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        topBar = { TopAppBar(title = { Text("EventManager") }) },
        content = { padding ->
            NavHost(
                navController = navController,
                startDestination = NavRoutes.WORKERS,
                modifier = Modifier.padding(padding)
            ) {
                composable(NavRoutes.WORKERS) { WorkerScreen(navController) }
                composable(NavRoutes.EVENTS) { EventScreen(navController) }
                composable(NavRoutes.ENGAGEMENTS) { EngagementScreen(navController) }
                composable(NavRoutes.EXPORT) { ExportScreen(navController) }
            }
        }
    )
}
