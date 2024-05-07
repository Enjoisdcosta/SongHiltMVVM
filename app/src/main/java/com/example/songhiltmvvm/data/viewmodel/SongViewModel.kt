package com.example.songhiltmvvm.data.viewmodel

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.songhiltmvvm.data.model.ResultModel
import com.example.songhiltmvvm.data.model.SongsModel
import com.example.songhiltmvvm.data.repository.SongRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SongViewModel @Inject constructor(private val marvelRepository: SongRepository) : ViewModel() {
    val songLiveData = MutableLiveData<List<ResultModel>>()
    val errorLivedata = MutableLiveData<String>()


//    @SuppressLint("SuspiciousIndentation")
    fun fetchSong() {
    viewModelScope.launch(Dispatchers.IO) {
        val response = marvelRepository.getAllSong()

        if (response.isSuccessful) {
            songLiveData.postValue(response.body())
        } else {
            errorLivedata.postValue(response.errorBody().toString())
            Log.i("Data_Marvel", response.errorBody().toString())
//
//            }

        }
    }
}}

private fun <T> MutableLiveData<T>.postValue(body: SongsModel?) {

}
