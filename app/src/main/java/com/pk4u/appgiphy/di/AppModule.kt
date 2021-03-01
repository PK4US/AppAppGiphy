package com.pk4u.appgiphy.di

import com.pk4u.appgiphy.data.network.GiphyApi
import com.pk4u.appgiphy.data.network.GiphyApiService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideApi(): GiphyApi = GiphyApiService.getClient()
}