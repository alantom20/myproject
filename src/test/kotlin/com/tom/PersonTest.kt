package com.tom.kotlin

import com.tom.Human
import com.tom.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun bmiTest(){
        val human = Human(60.5f,1.7f,"Peter")
        Assertions.assertEquals(60.5f/(1.7f*1.7f),human.bmi())
    }
    @Test
    fun getAverageTest(){
        val student = Student("Peter",60,70)
        Assertions.assertEquals((60+70)/2,student.getAverage())
    }
    @Test
    fun highestTest(){
        val student = Student("Peter",60,70)
        Assertions.assertEquals(70,student.highest())
    }



}