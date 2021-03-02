package com.pk4u.appgiphy.di

import com.pk4u.appgiphy.data.network.GiphyApi
import com.pk4u.appgiphy.data.network.GiphyApiService
import com.pk4u.appgiphy.model.Data
import com.pk4u.appgiphy.repository.TrendingRepository
import com.pk4u.appgiphy.view.adapter.TrendingAdapter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideApi(): GiphyApi = GiphyApiService.getClient()

    @Provides
    fun provideTrendingRepository() = TrendingRepository()

    @Provides
    fun provideListData() = ArrayList<Data>()

    @Provides
    fun provideTrendingAdapter(data: ArrayList<Data>): TrendingAdapter = TrendingAdapter(data)
}