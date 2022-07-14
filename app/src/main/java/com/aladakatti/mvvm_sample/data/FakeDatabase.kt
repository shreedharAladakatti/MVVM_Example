package com.aladakatti.mvvm_sample.data

class FakeDatabase private constructor(){

    var quoteDao = FakeQuoteDAO()

    companion object {
        @Volatile
        private var instance: FakeDatabase ?= null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: FakeDatabase().also { instance = it }
            }
    }

}