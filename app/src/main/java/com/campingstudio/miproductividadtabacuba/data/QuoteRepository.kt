package com.campingstudio.miproductividadtabacuba.data

import com.campingstudio.miproductividadtabacuba.data.model.QuoteModel
import com.campingstudio.miproductividadtabacuba.data.model.QuoteProvider
import com.campingstudio.miproductividadtabacuba.data.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(private val api :QuoteService ){

    suspend fun getAllQuotes(): List<QuoteModel> {
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}