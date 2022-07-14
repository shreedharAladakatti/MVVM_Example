package com.aladakatti.mvvm_sample.utilities

import com.aladakatti.mvvm_sample.data.FakeDatabase
import com.aladakatti.mvvm_sample.data.QuoteRepository
import com.aladakatti.mvvm_sample.ui.quotes.QuotesViewModelFactory


object InjectorUtils {

    fun provideQuotesViewModelFactory() : QuotesViewModelFactory {
        val quoteRepository = QuoteRepository
            .getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }

}
