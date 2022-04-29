package com.campingstudio.miproductividadtabacuba.data.network

import com.campingstudio.miproductividadtabacuba.core.RetrofitHelper
import com.campingstudio.miproductividadtabacuba.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class QuoteService @Inject constructor(private val quoteApiClient: QuoteApiClient){
     suspend fun getQuotes(): List<QuoteModel> {
        return withContext(Dispatchers.IO) {
            val response = quoteApiClient.getAllQuotes()
            response.body() ?: emptyList()
        }
    }

}