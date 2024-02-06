package com.ryan.news.data.responseModel

import com.google.gson.annotations.SerializedName

data class SampleResponseModel(
    @SerializedName("data") val data: String,
) {

}
