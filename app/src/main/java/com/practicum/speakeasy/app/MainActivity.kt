package com.practicum.speakeasy.app

import android.annotation.SuppressLint
import android.content.ClipData.Item
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.primarySurface
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.practicum.speakeasy.app.ui.theme.SpeakEasyTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        to hide StatusBar (верхняя панель)
//        window.decorView.windowInsetsController!!.hide(
//            android.view.WindowInsets.Type.statusBars()
//        )

//        to hide NavigationBar (нижняя панель)
        window.decorView.windowInsetsController!!.hide(
            android.view.WindowInsets.Type.statusBars()
                    or android.view.WindowInsets.Type.navigationBars()
        )

        enableEdgeToEdge()
        setContent {
            SpeakEasyTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        BottomNavigationBar()
                    }
                ) { innerPadding ->

                }
            }
        }
    }

    @Composable
    fun BottomNavigationBar() {
        BottomNavigation(
            backgroundColor = MaterialTheme.colors.primarySurface,
            contentColor = MaterialTheme.colors.primary // цвет айтемов
        ) {
            BottomNavigationItem(
                icon = {
                    Icon(
                        ImageVector.vectorResource(id = R.drawable.ic_chat),
                        contentDescription = "Chat"
                    )
                },
                selected = false,
                onClick = {

                }
            )
            BottomNavigationItem(
                icon = {
                    Icon(
                        ImageVector.vectorResource(id = R.drawable.ic_camera),
                        contentDescription = "Camera"
                    )
                },
                selected = false,
                onClick = {

                }
            )
            BottomNavigationItem(
                icon = {
                    Icon(
                        ImageVector.vectorResource(id = R.drawable.ic_translate),
                        contentDescription = "Translate"
                    )
                },
                selected = true,
                onClick = {

                }
            )
            BottomNavigationItem(
                icon = {
                    Icon(
                        ImageVector.vectorResource(id = R.drawable.ic_history),
                        contentDescription = "History"
                    )
                },
                selected = false,
                onClick = {

                }
            )
            BottomNavigationItem(
                icon = {
                    Icon(
                        ImageVector.vectorResource(id = R.drawable.ic_fav),
                        contentDescription = "Favourite"
                    )
                },
                selected = false,
                onClick = {

                }
            )
        }
    }
}

