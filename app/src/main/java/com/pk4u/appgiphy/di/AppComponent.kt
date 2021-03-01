package com.pk4u.appgiphy.di

import com.pk4u.appgiphy.repository.TrendingRepository
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(trendingRepository: TrendingRepository)
}