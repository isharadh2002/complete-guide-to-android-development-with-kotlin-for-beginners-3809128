package com.example.two.trees

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.two.trees.data.Product
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

private const val TAG = "MainViewModel"

class MainViewModel : ViewModel() {

    private val _quantity = MutableStateFlow(0)
    val quantity: StateFlow<Int> = _quantity

    init {
        val product = Product(
            productName = "Tomato Sauce",
            imageFile = "tomato_sauce.jpg",
            description = "Fresh tomatoes in a delicious sauce",
            size = 10,
            price = 1.99
        )
        Log.i(TAG, "initialized")
        Log.i(TAG, product.toString())
    }

}
