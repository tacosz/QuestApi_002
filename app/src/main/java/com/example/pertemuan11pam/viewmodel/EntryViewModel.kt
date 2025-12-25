package com.example.pertemuan11pam.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.pertemuan11pam.modeldata.UIStateSiswa
import com.example.pertemuan11pam.repositori.RepositoryDataSiswa
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class EntryViewModel(private val repositoryDataSiswa: RepositoryDataSiswa):
    ViewModel() {
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set
}