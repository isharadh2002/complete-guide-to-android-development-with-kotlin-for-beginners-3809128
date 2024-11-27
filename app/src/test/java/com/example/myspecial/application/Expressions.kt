package com.example.myspecial.application

import org.junit.Test
import java.lang.NumberFormatException

fun isEven(a: Int): String {
    return if (a % 2 == 0) {
        "it's even"
    } else {
        "it's odd"
    }
}

fun stringToInt(x: String): Int {
    return try {
        x.toInt()
    } catch (e: NumberFormatException) {
        0
    }
}

class ExpressionsTest {

    @Test
    fun ifAsExpression() {
        // TODO: print the results of the isEven function with `2`
        var value :Int = 2
        println("Number $value is " + isEven(value))

        // TODO: print the results of the isEven function with `3`
        value = 3
        println("Number $value is " + isEven(value))
    }

    @Test
    fun tryCatchAsExpression() {
        // TODO: print the results of the stringToInt function with `"2"`
        var value :String = "2"
        println("String \"$value\" converted to int : " + stringToInt(value))

        // TODO: print the results of the stringToInt function with `"cake"`
        value = "cake"
        println("String \"$value\" converted to int : " + stringToInt(value))

    }

}
