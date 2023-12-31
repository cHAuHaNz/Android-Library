package `in`.simplifiedbytes.example.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import `in`.simplifiedbytes.example.ui.screens.MainScreen
import `in`.simplifiedbytes.example.ui.theme.BuildUtilsExampleAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        setupSplashScreen()

        super.onCreate(savedInstanceState)

        setContent {
            BuildUtilsExampleAppTheme() {
                MainScreen()
            }
        }
    }

    private fun setupSplashScreen() {
        var keepSplashScreenOn = true
        lifecycleScope.launch {
            lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                delay(2000)
                keepSplashScreenOn = false
            }
        }

        installSplashScreen().setKeepOnScreenCondition {
            keepSplashScreenOn
        }
    }
}
