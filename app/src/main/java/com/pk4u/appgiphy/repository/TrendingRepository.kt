package com.pk4u.appgiphy.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.pk4u.appgiphy.Data
import com.pk4u.appgiphy.data.network.GiphyApi
import com.pk4u.appgiphy.di.DaggerAppComponent
import javax.inject.Inject

class TrendingRepository {

    @Inject
    lateinit var giphyApiService: GiphyApi

    private val _data by lazy { MutableLiveData<List<Data>>() }
    val data: LiveData<List<Data>>
        get() = _data

    private val _isInProgress by lazy { MutableLiveData<Boolean>() }
    val isInProgress: LiveData<Boolean>
        get() = _isInProgress

    private val _isError by lazy { MutableLiveData<Boolean>() }
    val isError: LiveData<Boolean>
        get() = _isError


    init {
        DaggerAppComponent.create().inject(this)
    }
}