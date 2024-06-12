package com.example.mokitounittesting

import org.junit.Before
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnit
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CalculateExampleTest{

    @Mock
    lateinit var calculateExample: CalculateExample
    @Before
    fun onsetUp(){
        calculateExample = CalculateExample()
    }

    @org.junit.Test
    fun addTwoNumberN() {
        val a = 100
        val b = 80
        val result = calculateExample.addTwoNumber(a,b)
        println("after add two number:- $result")
    }
    @org.junit.Test
    fun subtractTwoNumberN() {
        val result = calculateExample.subtractTwoNumber(100,80)
        println("subtract add two number:- $result")
    }

}