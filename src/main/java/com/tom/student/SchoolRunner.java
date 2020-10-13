package com.tom.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        //userInput();
        GraduateStudent graduateStudent = new GraduateStudent("4","ken",60,65,62);
        graduateStudent.print();
        Student.pass = 50;
        Student stu1= new Student("0","Tom",60,50);
        stu1.print();
        Student stu2= new Student("1","Peter",20,50);
        stu2.print();
        Student stu3= new Student("2","Hank",60,50);
        stu3.print();
        Student stu4= new Student("3","Eric",70,50);
        stu4.print();
        System.out.println("High score : " + stu1.highest());


    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter student id:");
        String id = scanner.next();
        System.out.print("Please enter student name:");
        String name = scanner.next();
        System.out.print("Please enter student english");
        Integer english = scanner.nextInt();
        System.out.print("Please enter student math");
        Integer math = scanner.nextInt();
        Student stu1= new Student(id,name,english,math);
        stu1.print();
        System.out.println("High score : " + stu1.highest());
    }


}
