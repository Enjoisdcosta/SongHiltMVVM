package com.example.songhiltmvvm.data.injection

import com.example.songhiltmvvm.data.api.APIDetail.BASE_URL
import com.example.songhiltmvvm.data.api.SongAPI
import com.example.songhiltmvvm.data.repository.SongRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(Singleton::class)
class SongModule {

    @Singleton
    @Provides
    fun provideApiServiceObject(): SongAPI =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(SongAPI::class.java)


    @Singleton
    @Provides
    fun provideSongRepository() : SongRepository =
        SongRepository(provideApiServiceObject())

}