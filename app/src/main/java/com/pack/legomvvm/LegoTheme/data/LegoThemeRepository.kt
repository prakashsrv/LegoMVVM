package com.pack.legomvvm.LegoTheme.data

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LegoThemeRepository @Inject constructor(private val dao: LegoThemeDao,
                                              private val remoteSource: LegoThemeRemoteDataSource) {

    val themes = resultLiveData(
        databaseQuery = { dao.getLegoThemes() },
        networkCall = { remoteSource.fetchData() },
        saveCallResult = { dao.insertAll(it.results) })

}