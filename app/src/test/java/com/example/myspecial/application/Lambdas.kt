package com.example.myspecial.application

import org.junit.Test

data class User(val name: String)

val users = listOf(
    User(name = "Android"),
    User(name = "Learners"),
    User(name = "")
)

class LambdasTest {

    @Test
    fun lambdaWithType() {
        // TODO: create lambda variable
        val nameFilter:(User) -> Boolean = {it.name.isNotEmpty()}

        val usersWithNames = users.filter(nameFilter)

        println(usersWithNames)
    }

    @Test
    fun lambdaInlined() {
        // TODO: inline lambda
        val usersWithNoNames = users.filter({it.name.isEmpty()})

        println(usersWithNoNames)
    }

}
