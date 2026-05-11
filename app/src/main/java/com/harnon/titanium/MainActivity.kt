package com.harnon.titanium

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import com.harnon.titanium.ui.navigation.HarnonNavHost
import com.harnon.titanium.ui.theme.TitaniumDesignSystem
import com.harnon.titanium.ui.theme.HarnonTheme
import com.harnon.titanium.viewmodel.HarnonViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            val navController = rememberNavController()
            val viewModel: HarnonViewModel = hiltViewModel()

            HarnonTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    HarnonNavHost(
                        navController = navController,
                        viewModel = viewModel
                    )
                }
            }
        }
    }
}
