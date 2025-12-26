package com.example.pertemuan11pam.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.pertemuan11pam.modeldata.DataSiswa
import com.example.pertemuan11pam.repositori.RepositoryDataSiswa

sealed interface StatusUiDetail {
    data class Success(val satusiswa: DataSiswa): StatusUiDetail
    object Error : StatusUiDetail
    object Loading : StatusUiDetail
}
class DetailViewModel (savedStateHandle: SavedStateHandle, private val repositoryDataSiswa: RepositoryDataSiswa): ViewModel(){
    private val idSiswa: Int = checkNotNull(savedStateHandle[DestinasiDetail.itemIdArg])
    var statusUiDetail: StatusUiDetail by mutableStateOf(StatusUiDetail.Loading)
        private set
    init {
        getSatuSiswa()
    }
}