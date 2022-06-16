package com.stockbit.hiring.di

import com.stockbit.feature_login.di.loginModule
import com.stockbit.local.di.localModule
import com.stockbit.remote.di.createRemoteModule
import com.stockbit.repository.di.repositoryModule
import org.koin.dsl.module

val appComponent= listOf(
    createRemoteModule("https://api.github.com/"),
    repositoryModule,
    localModule,
    loginModule
)