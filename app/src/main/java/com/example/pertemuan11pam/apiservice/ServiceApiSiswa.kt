package com.example.pertemuan11pam.apiservice

import retrofit2.http.GET

interface ServiceApiSiswa {
    @GET(value = "bacaTeman.php")
    suspend fun getSiswa(): List<DataSiswa>
}