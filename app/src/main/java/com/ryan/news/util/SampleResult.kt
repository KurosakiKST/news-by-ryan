package com.ryan.news.util

sealed class SampleResult<out T> {
    data class Success<T>(val data: T) : SampleResult<T>()
    data class Failure(val error: Exception) : SampleResult<Nothing>()
}