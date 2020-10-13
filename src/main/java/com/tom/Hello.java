package com.tom;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        String s = "abcde";
        System.out.println(s.length());
        Person p = new Person("Hank",66.2f,1.8f);
        p.hello();
        p.weight = 66.5f;
        p.height = 1.7f;
        System.out.println(p.bmi());

       /* p.hello();
        int age = 19;
        Integer age2 = 19;
        float weight = 61.7f;
        Float height = 1.7f;
        char c = 'b';
        Character c2 = 'A';
        byte b = 50;
        boolean adult = true;
        boolean enroll = false;
        String name = "Alan";*/
    }
}
