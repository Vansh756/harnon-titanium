package com.harnon.titanium.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.harnon.titanium.ui.screens.EqualizerScreen
import com.harnon.titanium.ui.screens.NowPlayingScreen
import com.harnon.titanium.ui.screens.VaultScreen
import com.harnon.titanium.ui.screens.ZenModeScreen
import com.harnon.titanium.viewmodel.HarnonViewModel

object Routes {
    const val NOW_PLAYING = "now_playing"
    const val EQUALIZER = "equalizer"
    const val ZEN_MODE = "zen_mode"
    const val VAULT = "vault"
}

@Composable
fun HarnonNavHost(
    navController: NavHostController,
    viewModel: HarnonViewModel
) {
    NavHost(
        navController = navController,
        startDestination = Routes.NOW_PLAYING
    ) {
        composable(Routes.NOW_PLAYING) {
            NowPlayingScreen(
                viewModel = viewModel,
                onNavigateToEqualizer = { navController.navigate(Routes.EQUALIZER) },
                onNavigateToZenMode = { navController.navigate(Routes.ZEN_MODE) },
                onNavigateToVault = { navController.navigate(Routes.VAULT) }
            )
        }
        composable(Routes.EQUALIZER) {
            EqualizerScreen(
                viewModel = viewModel,
                onBack = { navController.popBackStack() }
            )
        }
        composable(Routes.ZEN_MODE) {
            ZenModeScreen(
                viewModel = viewModel,
                onBack = { navController.popBackStack() }
            )
        }
        composable(Routes.VAULT) {
            VaultScreen(
                viewModel = viewModel,
                onBack = { navController.popBackStack() }
            )
        }
    }
}
