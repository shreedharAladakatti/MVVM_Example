package com.aladakatti.mvvm_sample.ui.quotes

import androidx.lifecycle.ViewModel
import com.aladakatti.mvvm_sample.data.Quote
import com.aladakatti.mvvm_sample.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel(){

        fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

        fun getQuotes() = quoteRepository.getQuote()

}