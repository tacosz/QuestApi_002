package com.example.pertemuan11pam.uicontroller

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.pertemuan11pam.uicontroller.route.DestinasiEntry
import com.example.pertemuan11pam.uicontroller.route.DestinasiHome
import com.example.pertemuan11pam.view.EntrySiswaScreen
import com.example.pertemuan11pam.view.HomeScreen
import java.lang.reflect.Modifier

@Composable
fun DataSiswaApp(navController: NavHostController = rememberNavController(),
                 modifier: Modifier){
    HostNavigasi(navController = navController)
}

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    NavHost(navController = navController, startDestination = DestinasiHome.route,
        modifier = Modifier){
        composable(DestinasiHome.route){
            HomeScreen(navigateToItemEntry = {navController.navigate
                (DestinasiEntry.route)},
                navigateToItemUpdate = {
                    navController.navigate("${DestinasiDetail.route}/${it}")
                })
        }
        composable(DestinasiEntry.route){
            EntrySiswaScreen(navigateBack = {navController.navigate(DestinasiHome.route)})
        }
    }
}