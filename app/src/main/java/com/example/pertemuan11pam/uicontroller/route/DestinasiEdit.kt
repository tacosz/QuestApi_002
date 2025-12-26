package com.example.pertemuan11pam.uicontroller.route

import com.example.pertemuan11pam.R

object DestinasiEdit: DestinasiNavigasi{
    override val route = "item_edit"
    override val titleRes = R.string.edit_siswa

    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}