package com.example.pertemuan11pam.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.pertemuan11pam.modeldata.UIStateSiswa
import com.example.pertemuan11pam.repositori.RepositoryDataSiswa

class EditViewModel (savedStateHandle: SavedStateHandle,private  val repositoryDataSiswa: RepositoryDataSiswa): ViewModel(){
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set
}