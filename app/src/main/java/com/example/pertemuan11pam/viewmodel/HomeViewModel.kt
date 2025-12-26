package com.example.pertemuan11pam.viewmodel

import android.net.http.HttpException
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.pertemuan11pam.modeldata.DataSiswa
import com.example.pertemuan11pam.repositori.RepositoryDataSiswa
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import okio.IOException

sealed interface StatusUiSiswa{
    data class Success(val siswa: List<DataSiswa> = listOf()) : StatusUiSiswa
    object Error : StatusUiSiswa
    object Loading : StatusUiSiswa
}
class HomeViewModel(private val repositoryDataSiswa: RepositoryDataSiswa):
        ViewModel(){
            val listSiswa: StatusUiSiswa by mutableStateOf(StatusUiSiswa.Loading)
                private set
    init {
        loadSiswa()
    }
    fun loadSiswa(){
        viewModelScope.launch {
            listSiswa = StatusUiSiswa.Loading
            listSiswa = try {
                StatusUiSiswa.Success(repositoryDataSiswa.getDataSiswa())
            }catch (e: IOException){
                StatusUiSiswa.Error
            }
            catch (e: HttpException){
                StatusUiSiswa.Error
            }
        }
    }
        }