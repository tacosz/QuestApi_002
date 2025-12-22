package com.example.pertemuan11pam.repositori

interface ContainerApp {
    val repositoryDataSiswa : RepositoryDataSiswa
}

class DefaultContainerApp : ContainerApp{
    private val baseurl = "http://10.0.2.2/umyTI/"


}