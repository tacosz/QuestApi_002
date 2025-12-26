package com.example.pertemuan11pam.viewmodel

import com.example.pertemuan11pam.modeldata.DataSiswa

sealed interface StatusUiDetail {
    data class Success(val satusiswa: DataSiswa): StatusUiDetail
    object Error : StatusUiDetail
    object Loading : StatusUiDetail
}