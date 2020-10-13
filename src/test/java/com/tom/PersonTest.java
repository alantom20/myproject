package com.tom;

import com.tom.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void bmiTest(){
        Person person = new Person(66.5f,1.7f);
        Assertions.assertEquals(66.5f/(1.7f*1.7f),person.bmi());
    }
    @Test
    public void getAverageTest(){
        Student student = new Student("1","Tom",60,49);
        Assertions.assertEquals((60+49)/2,student.getAverage());
    }
}