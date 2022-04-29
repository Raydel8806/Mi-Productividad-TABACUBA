package com.campingstudio.miproductividadtabacuba.data.network

import com.campingstudio.miproductividadtabacuba.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {
    @GET("/.json")
    suspend fun getAllQuotes(): Response<List<QuoteModel>>
}