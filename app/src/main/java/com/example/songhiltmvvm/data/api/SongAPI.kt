package com.example.songhiltmvvm.data.api

import com.example.songhiltmvvm.data.model.ResultModel
import com.example.songhiltmvvm.data.model.SongsModel
import retrofit2.Response
import retrofit2.http.GET

interface SongAPI {

    @GET("search?term=classick&amp;media=music&amp;entity=song&amp;limit=50")
    suspend fun getAllList(): Response<SongsModel>

}