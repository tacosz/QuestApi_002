package com.example.pertemuan11pam.repositori

import com.example.pertemuan11pam.apiservice.ServiceApiSiswa
import com.example.pertemuan11pam.modeldata.DataSiswa

interface RepositoryDataSiswa {
    suspend fun getDataSiswa() : List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa) :retrofit2.Response<Void>
    suspend fun getSatuSiswa(id: Int) : DataSiswa
    suspend fun editSatuSiswa(id: Int,dataSiswa: DataSiswa):retrofit2.Response<Void>
    suspend fun hapusSatuSiswa(id: Int):retrofit2.Response<Void>
}

class JaringanRepositoryDataSiswa(
    private val serviceApiSiswa: ServiceApiSiswa
): RepositoryDataSiswa{
    override suspend fun getDataSiswa(): List<DataSiswa> = serviceApiSiswa.getSiswa()
    override suspend fun postDataSiswa(dataSiswa: DataSiswa):retrofit2.Response<Void> = serviceApiSiswa.postSiswa(dataSiswa)
}
