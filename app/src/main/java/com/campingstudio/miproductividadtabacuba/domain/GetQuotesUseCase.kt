package com.campingstudio.miproductividadtabacuba.domain

import com.campingstudio.miproductividadtabacuba.data.QuoteRepository
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(private val repository : QuoteRepository ) {
     suspend operator fun invoke() = repository.getAllQuotes()
}