package com.ryan.news.di

import com.ryan.news.data.dataSource.SampleDataSource
import com.ryan.news.data.remoteDataSource.SampleRemoteDataSource
import com.ryan.news.data.repoImpl.SampleRepoImpl
import com.ryan.news.domain.repository.SampleRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class AbstractModule {

    /**-------DataSources--------*/
    @Binds
    abstract fun provideSampleDataSource(loginDataSource: SampleRemoteDataSource): SampleDataSource

    /**-------Repositories-------*/
    @Binds
    abstract fun provideSampleRepo(loginRepoImpl: SampleRepoImpl): SampleRepository

}