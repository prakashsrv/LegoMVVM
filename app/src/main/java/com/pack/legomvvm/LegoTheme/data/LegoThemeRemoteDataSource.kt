package com.pack.legomvvm.LegoTheme.data

import com.pack.legomvvm.api.BaseDataSource
import com.pack.legomvvm.api.LegoService
import javax.inject.Inject


class LegoThemeRemoteDataSource @Inject constructor(private val service: LegoService) : BaseDataSource() {

    suspend fun fetchData() = getResult { service.getThemes(1, 1000, "-id") }

}
