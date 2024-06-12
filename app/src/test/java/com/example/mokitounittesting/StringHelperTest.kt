package com.example.mokitounittesting

import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class StringHelperTest{
    lateinit var SUT:StringHelper

    @Before
    fun setUp(){
        SUT = StringHelper()
    }

    @Test
    fun test(){
        val result = SUT.isPositiveNumber(2)
        println("number $result")
    }
}