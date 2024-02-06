package com.ryan.news.domain.usecase

import com.ryan.news.domain.repository.SampleRepository
import javax.inject.Inject

class SampleUseCase @Inject constructor(
    private val loginRepository: SampleRepository
) {

}