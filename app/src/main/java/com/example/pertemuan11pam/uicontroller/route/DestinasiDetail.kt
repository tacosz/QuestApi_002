package com.example.pertemuan11pam.uicontroller.route

import com.example.pertemuan11pam.R

object DestinasiDetail: DestinasiNavigasi{
    override val route = "detail_siswa"
    override val titleRes = R.string.detail_siswa

    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}