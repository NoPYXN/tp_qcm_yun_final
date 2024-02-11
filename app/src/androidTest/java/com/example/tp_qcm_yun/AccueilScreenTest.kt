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
    fun test_element() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val navController = NavController(context)

        composeTestRule.setContent {
            Accueil_Screen(navController = navController)
        }

        composeTestRule.onNodeWithText("Liste des QCM").assertExists()
        composeTestRule.onNodeWithText("QCM sur le bodybuilding").assertExists()
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 1").assertExists()
        composeTestRule.onNodeWithText("QCM sur la musique").assertExists()
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 2").assertExists()
        composeTestRule.onNodeWithText("QCM sur les chaussures").assertExists()
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 3").assertExists()
    }

    @Test
    fun test_supression_element() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val navController = NavController(context)

        composeTestRule.setContent {
            Accueil_Screen(navController = navController)
        }

        composeTestRule.onNodeWithText("Liste des QCM").assertExists()

        composeTestRule.onNodeWithText("QCM sur le bodybuilding").assertExists()
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 1").assertExists()
        composeTestRule.onNodeWithText("QCM sur la musique").assertExists()
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 2").assertExists()
        composeTestRule.onNodeWithText("QCM sur les chaussures").assertExists()
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 3").assertExists()

        //Tester de répondre NON pour le premier qcm
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 1").performClick()
        composeTestRule.onNodeWithText("Êtes-vous sûr de vouloir supprimer cet élément ?").assertExists()
        composeTestRule.onNodeWithText("Non").performClick()
        composeTestRule.onNodeWithText("QCM sur le bodybuilding").assertExists()
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 1").assertExists()
        composeTestRule.onNodeWithText("QCM sur la musique").assertExists()
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 2").assertExists()
        composeTestRule.onNodeWithText("QCM sur les chaussures").assertExists()
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 3").assertExists()

        //Tester de répondre NON pour le deuxieme qcm
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 2").performClick()
        composeTestRule.onNodeWithText("Êtes-vous sûr de vouloir supprimer cet élément ?").assertExists()
        composeTestRule.onNodeWithText("Non").performClick()
        composeTestRule.onNodeWithText("QCM sur le bodybuilding").assertExists()
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 1").assertExists()
        composeTestRule.onNodeWithText("QCM sur la musique").assertExists()
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 2").assertExists()
        composeTestRule.onNodeWithText("QCM sur les chaussures").assertExists()
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 3").assertExists()

        //Tester de répondre NON pour le troisième qcm
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 3").performClick()
        composeTestRule.onNodeWithText("Êtes-vous sûr de vouloir supprimer cet élément ?").assertExists()
        composeTestRule.onNodeWithText("Non").performClick()
        composeTestRule.onNodeWithText("QCM sur le bodybuilding").assertExists()
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 1").assertExists()
        composeTestRule.onNodeWithText("QCM sur la musique").assertExists()
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 2").assertExists()
        composeTestRule.onNodeWithText("QCM sur les chaussures").assertExists()
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 3").assertExists()

        //Tester de répondre OUI pour le premier qcm
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 1").performClick()
        composeTestRule.onNodeWithText("Êtes-vous sûr de vouloir supprimer cet élément ?").assertExists()
        composeTestRule.onNodeWithText("Oui").performClick()
        composeTestRule.onNodeWithText("QCM sur le bodybuilding").assertDoesNotExist()
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 1").assertDoesNotExist()
        composeTestRule.onNodeWithText("QCM sur la musique").assertExists()
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 2").assertExists()
        composeTestRule.onNodeWithText("QCM sur les chaussures").assertExists()
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 3").assertExists()

        //Tester de répondre OUI pour le deuxieme qcm
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 2").performClick()
        composeTestRule.onNodeWithText("Êtes-vous sûr de vouloir supprimer cet élément ?").assertExists()
        composeTestRule.onNodeWithText("Oui").performClick()
        composeTestRule.onNodeWithText("QCM sur le bodybuilding").assertDoesNotExist()
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 1").assertDoesNotExist()
        composeTestRule.onNodeWithText("QCM sur la musique").assertDoesNotExist()
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 2").assertDoesNotExist()
        composeTestRule.onNodeWithText("QCM sur les chaussures").assertExists()
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 3").assertExists()

        //Tester de répondre OUI pour le troisième qcm
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 3").performClick()
        composeTestRule.onNodeWithText("Êtes-vous sûr de vouloir supprimer cet élément ?").assertExists()
        composeTestRule.onNodeWithText("Oui").performClick()
        composeTestRule.onNodeWithText("QCM sur le bodybuilding").assertDoesNotExist()
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 1").assertDoesNotExist()
        composeTestRule.onNodeWithText("QCM sur la musique").assertDoesNotExist()
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 2").assertDoesNotExist()
        composeTestRule.onNodeWithText("QCM sur les chaussures").assertDoesNotExist()
        composeTestRule.onNodeWithContentDescription("supprimer le qcm 3").assertDoesNotExist()
    }
}
