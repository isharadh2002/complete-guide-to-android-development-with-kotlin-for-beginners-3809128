package com.example.myspecial.application

import org.junit.Test

// TODO: Create the multiply function with `left` and `right`
fun multiply(left: Int = 1, right: Int = 1): Int {
    return left * right
}

class FunctionsTest {

    @Test
    fun functionCreation() {
        // TODO: print the results of the multiply function
        var result = multiply(2, 3)
        println("The result of multiplication function : $result")

        // TODO: print the results of the multiply function with named
        result = multiply(left = 2, right = 3)
        println("The result of multiplication function with named parameters : $result")

    }

    @Test
    fun functionDefaultValues() {
        // TODO: print the results of the multiply function with defaults
        var result: Int = multiply()
        println("The result of multiplication function with defaults : $result")


        // TODO: print the results of the multiply function with named defaults
        result = multiply(left = 2)
        println("The result of multiplication function with named defaults : $result")
    }
}
