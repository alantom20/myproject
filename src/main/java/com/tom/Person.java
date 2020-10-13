package com.tom;

public class Person {
    float weight;
    float height;
    String name;

    public Person() {
    }

    public Person(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }
    public Person(String name,float weight,float height){
        this(weight,height);
        this.name = name;

    }

    public void hello(){
        System.out.println("Hello world");
    }
    public float bmi(){
        float bmi;
        bmi = weight/(height*height);
        return bmi;
    }
}
