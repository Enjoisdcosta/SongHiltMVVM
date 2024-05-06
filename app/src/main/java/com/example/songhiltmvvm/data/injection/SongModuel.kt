package com.example.songhiltmvvm.data.injection

import com.example.songhiltmvvm.data.api.APIDetail.BASE_URL
import com.example.songhiltmvvm.data.api.SongAPI
import com.example.songhiltmvvm.data.repository.SongRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SongModuel {

    @Singleton
    @Provides
    fun provideAPIServiceObject(): SongAPI =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(SongAPI::class.java)

    @Singleton
    @Provides
    fun provideITunesRepo(): SongRepository =
        SongRepository(provideAPIServiceObject())
}