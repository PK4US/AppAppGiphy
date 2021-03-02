package com.pk4u.appgiphy.di

import com.pk4u.appgiphy.MainActivity
import com.pk4u.appgiphy.repository.TrendingRepository
import com.pk4u.appgiphy.viewmodel.TrendingViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(trendingRepository: TrendingRepository)

    fun inject(viewModel: TrendingViewModel)

    fun inject(mainActivity: MainActivity)
}