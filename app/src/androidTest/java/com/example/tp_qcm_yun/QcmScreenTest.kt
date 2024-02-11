package com.example.tp_qcm_yun

import android.content.Context
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.test.core.app.ApplicationProvider
import org.junit.Rule
import org.junit.Test


class QcmScreenTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun test_qcm_bodybuilding_succes() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val navController = NavController(context)

        composeTestRule.setContent {
            QcmScreenContent(numero = 1, navController = navController)
        }

        composeTestRule.onNodeWithText("Qui est actuellement le vainqueur de Mister Olympia (catégorie Classique Physique) depuis 4 ans d'affilée ?").assertExists()

        composeTestRule.onNodeWithText("Chris Bumstead").assertExists()
        composeTestRule.onNodeWithText("Ramon Rocha Queiroz").assertExists()
        composeTestRule.onNodeWithText("Stephane Matala").assertExists()
        composeTestRule.onNodeWithText("Nickolas Venuti").assertExists()

        composeTestRule.onNodeWithText("Chris Bumstead").performClick()

        composeTestRule.onNodeWithText("Bonne Réponse").assertExists()
    }

    @Test
    fun test_qcm_bodybuilding_fail() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val navController = NavController(context)

        composeTestRule.setContent {
            QcmScreenContent(numero = 1, navController = navController)
        }
        composeTestRule.onNodeWithText("Qui est actuellement le vainqueur de Mister Olympia (catégorie Classique Physique) depuis 4 ans d'affilée ?").assertExists()

        composeTestRule.onNodeWithText("Chris Bumstead").assertExists()
        composeTestRule.onNodeWithText("Ramon Rocha Queiroz").assertExists()
        composeTestRule.onNodeWithText("Stephane Matala").assertExists()
        composeTestRule.onNodeWithText("Nickolas Venuti").assertExists()

        composeTestRule.onNodeWithText("Ramon Rocha Queiroz").performClick()
        composeTestRule.onNodeWithText("Mauvaise Réponse").assertExists()
        composeTestRule.onNodeWithText("Retour").performClick()
        composeTestRule.onNodeWithText("Stephane Matala").performClick()
        composeTestRule.onNodeWithText("Mauvaise Réponse").assertExists()
        composeTestRule.onNodeWithText("Retour").performClick()
        composeTestRule.onNodeWithText("Nickolas Venuti").performClick()
        composeTestRule.onNodeWithText("Mauvaise Réponse").assertExists()
        composeTestRule.onNodeWithText("Retour").performClick()
    }

    @Test
    fun test_qcm_musique_succes() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val navController = NavController(context)

        composeTestRule.setContent {
            QcmScreenContent(numero = 2, navController = navController)
        }

        composeTestRule.onNodeWithText("Parmi ces artistes, qui a la musique la plus écoutée ?").assertExists()

        composeTestRule.onNodeWithText("XXX Tentacion").assertExists()
        composeTestRule.onNodeWithText("Scarlxrd").assertExists()
        composeTestRule.onNodeWithText("So la lune").assertExists()
        composeTestRule.onNodeWithText("Laylow").assertExists()

        composeTestRule.onNodeWithText("XXX Tentacion").performClick()

        composeTestRule.onNodeWithText("Bonne Réponse").assertExists()
    }

    @Test
    fun test_qcm_musique_fail() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val navController = NavController(context)

        composeTestRule.setContent {
            QcmScreenContent(numero = 2, navController = navController)
        }

        composeTestRule.onNodeWithText("Parmi ces artistes, qui a la musique la plus écoutée ?").assertExists()

        composeTestRule.onNodeWithText("XXX Tentacion").assertExists()
        composeTestRule.onNodeWithText("Scarlxrd").assertExists()
        composeTestRule.onNodeWithText("So la lune").assertExists()
        composeTestRule.onNodeWithText("Laylow").assertExists()

        composeTestRule.onNodeWithText("Scarlxrd").performClick()
        composeTestRule.onNodeWithText("Mauvaise Réponse").assertExists()
        composeTestRule.onNodeWithText("Retour").performClick()
        composeTestRule.onNodeWithText("So la lune").performClick()
        composeTestRule.onNodeWithText("Mauvaise Réponse").assertExists()
        composeTestRule.onNodeWithText("Retour").performClick()
        composeTestRule.onNodeWithText("Laylow").performClick()
        composeTestRule.onNodeWithText("Mauvaise Réponse").assertExists()
        composeTestRule.onNodeWithText("Retour").performClick()
    }

    @Test
    fun test_qcm_chaussures_succes() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val navController = NavController(context)

        composeTestRule.setContent {
            QcmScreenContent(numero = 3, navController = navController)
        }

        composeTestRule.onNodeWithText("Quelle est la paire de chaussures la plus chère parmi les quatre ?").assertExists()

        composeTestRule.onNodeWithText("Air Jordan 1 Retro High Off-White Chicago").assertExists()
        composeTestRule.onNodeWithText("Baskets en cuir rhyton Gucci").assertExists()
        composeTestRule.onNodeWithText("Balmain Unicorn").assertExists()
        composeTestRule.onNodeWithText("Nike SB Dunk Low Travis Scott").assertExists()

        composeTestRule.onNodeWithText("Air Jordan 1 Retro High Off-White Chicago").performClick()

        composeTestRule.onNodeWithText("Bonne Réponse").assertExists()
    }

    @Test
    fun test_qcm_chaussures_fail() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val navController = NavController(context)

        composeTestRule.setContent {
            QcmScreenContent(numero = 3, navController = navController)
        }

        composeTestRule.onNodeWithText("Quelle est la paire de chaussures la plus chère parmi les quatre ?").assertExists()

        composeTestRule.onNodeWithText("Air Jordan 1 Retro High Off-White Chicago").assertExists()
        composeTestRule.onNodeWithText("Baskets en cuir rhyton Gucci").assertExists()
        composeTestRule.onNodeWithText("Balmain Unicorn").assertExists()
        composeTestRule.onNodeWithText("Nike SB Dunk Low Travis Scott").assertExists()

        composeTestRule.onNodeWithText("Baskets en cuir rhyton Gucci").performClick()
        composeTestRule.onNodeWithText("Mauvaise Réponse").assertExists()
        composeTestRule.onNodeWithText("Retour").performClick()
        composeTestRule.onNodeWithText("Balmain Unicorn").performClick()
        composeTestRule.onNodeWithText("Mauvaise Réponse").assertExists()
        composeTestRule.onNodeWithText("Retour").performClick()
        composeTestRule.onNodeWithText("Nike SB Dunk Low Travis Scott").performClick()
        composeTestRule.onNodeWithText("Mauvaise Réponse").assertExists()
        composeTestRule.onNodeWithText("Retour").performClick()
    }
}