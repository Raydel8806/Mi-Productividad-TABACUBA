package com.campingstudio.miproductividadtabacuba.domain

import com.campingstudio.miproductividadtabacuba.data.QuoteRepository
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.RelaxedMockK
import junit.framework.TestCase
import org.junit.Before

class GetQuotesUseCaseTest : TestCase(){
    @RelaxedMockK
    private lateinit var quoteRepository: QuoteRepository

    lateinit var getQuotesUseCase: GetQuotesUseCase

    @Before
    fun onBefore() {
        MockKAnnotations.init(this)
    }

}