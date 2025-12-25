package com.example.pertemuan11pam.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.pertemuan11pam.modeldata.UIStateSiswa
import com.example.pertemuan11pam.repositori.RepositoryDataSiswa
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.example.pertemuan11pam.modeldata.DetailSiswa

class EntryViewModel(private val repositoryDataSiswa: RepositoryDataSiswa):
    ViewModel() {
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set

    private fun validasiInput(uiState: DetailSiswa = uiStateSiswa.detailSiswa):
            Boolean {
            return with(uiState) {
                nama.isNotBlank() && alamat.isNotBlank() && telpon.isNotBlank()
        }
    }
}