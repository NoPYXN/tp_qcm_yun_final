package com.example.tp_qcm_yun

import android.content.Context
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.navigation.NavController
import org.junit.Rule
import org.junit.Test
import androidx.test.core.app.ApplicationProvider

class AccueilScreenTest {
    @get:Rule
    val composeTestRule = createComposeRule()


    @Test
    fun testButtonsPresent() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val navController = NavController(context)

        composeTestRule.setContent {
            Accueil_Screen(navController = navController)
        }

        composeTestRule.onNodeWithText("Liste des QCM").assertExists()
        composeTestRule.onNodeWithText("QCM sur le bodybuilding").assertExists()
        composeTestRule.onNodeWithText("QCM sur la musique").assertExists()
        composeTestRule.onNodeWithText("QCM sur les chaussures").assertExists()
    }
}
