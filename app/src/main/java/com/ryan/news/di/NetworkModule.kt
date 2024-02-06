package com.ryan.news.di

import android.content.Context
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.ryan.news.data.remoteDataSource.CustomInterceptor
import com.ryan.news.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Dns
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    @Named("noAuth")
    fun provideNoAuthOkHttpClient(context: Context): OkHttpClient {
        return OkHttpClient.Builder()
            .dns(Dns.SYSTEM)
            .connectTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .addInterceptor(CustomInterceptor())
            .addInterceptor(ChuckerInterceptor(context))
            .build()
    }

    @Provides
    @Singleton
    @Named("noAuth")
    fun provideNoAuthRetrofit(@Named("noAuth") okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            // .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }
}