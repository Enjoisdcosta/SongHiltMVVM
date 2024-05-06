package com.example.songhiltmvvm.data.model


import com.google.gson.annotations.SerializedName

data class SongsModel(
    @SerializedName("resultCount")
    val resultCount: Int? = 0,
    @SerializedName("results")
    val results: List<ResultModel?>? = listOf()
)