package com.pk4u.appgiphy

import android.app.Application
import com.pk4u.appgiphy.database.TrendingDatabase


class GiphyApplication : Application() {

    companion object {
        lateinit var instance: GiphyApplication
        lateinit var database: TrendingDatabase
    }

    init {
        instance = this
    }

    override fun onCreate() {
        super.onCreate()
        database = TrendingDatabase.invoke(this)
    }
}