package com.example.pertemuan11pam.viewmodel

import com.example.pertemuan11pam.modeldata.DataSiswa

sealed interface StatusUiSiswa{
    data class Success(val siswa: List<DataSiswa> = listOf()) : StatusUiSiswa
    object Error : StatusUiSiswa
    object Loading : StatusUiSiswa
}