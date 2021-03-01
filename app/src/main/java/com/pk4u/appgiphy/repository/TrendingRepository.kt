package com.pk4u.appgiphy.repository

import com.pk4u.appgiphy.data.network.GiphyApi
import javax.inject.Inject

class TrendingRepository {
    @Inject
    lateinit var giphyApiService: GiphyApi
}