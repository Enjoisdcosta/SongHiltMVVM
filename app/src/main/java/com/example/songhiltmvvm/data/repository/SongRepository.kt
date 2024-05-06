package com.example.songhiltmvvm.data.repository

import com.example.songhiltmvvm.data.api.APIDetail
import com.example.songhiltmvvm.data.api.SongAPI
import javax.inject.Inject

class SongRepository@Inject constructor(private val service: SongAPI) {

    suspend fun getAllSong () = service.getAllList()
}