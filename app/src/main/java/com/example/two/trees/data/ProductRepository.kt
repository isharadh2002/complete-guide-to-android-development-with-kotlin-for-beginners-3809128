package com.example.two.trees.data

import android.content.Context

class ProductRepository (private val context: Context){
    fun getGetTextFromResources(resourceID: Int): String{
        return context.resources.openRawResource(resourceID)
            .bufferedReader()
            .use { it.readText() }
    }

}