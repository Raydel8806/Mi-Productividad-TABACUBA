package com.campingstudio.miproductividadtabacuba.domain

import com.campingstudio.miproductividadtabacuba.data.model.QuoteModel
import com.campingstudio.miproductividadtabacuba.data.model.QuoteProvider
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(){
    operator fun invoke(): QuoteModel?{
        val quotes = QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}