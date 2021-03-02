package com.pk4u.appgiphy.viewmodel

import androidx.lifecycle.ViewModel
import com.pk4u.appgiphy.di.DaggerAppComponent
import com.pk4u.appgiphy.repository.TrendingRepository
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class TrendingViewModel: ViewModel() {

    @Inject
    lateinit var repository: TrendingRepository

    private val compositeDisposable by lazy { CompositeDisposable() }

    init {
        DaggerAppComponent.create().inject(this)
        compositeDisposable.add(repository.fetchDataFromDatabase())
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }
}