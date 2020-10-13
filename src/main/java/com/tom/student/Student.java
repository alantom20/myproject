package com.tom.student;

public class Student {
    String id;
    String name;
    int english;
    int math;
    static int pass = 60;


    public Student(String id, String name, int english, int math) {
        this.id = id;
        this.name = name;
        this.english = english;
        this.math = math;
    }
    public int highest(){
        /*int max = 0;
        if(english > max){
            max = english;
        }else {
            max = math;
        }*/
        return (english > math) ? english : math;
    }
    public void print(){
        System.out.print(id + "\t" + name + "\t" + english + "\t" + math + "\t" +
                getAverage() + "\t" + (getAverage() >= pass ? "PASS" : "FAILED"));
        char grading = 'F';
        switch (getAverage()/10){
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
                break;
        }
        System.out.println(grading);

        /*if(getAverage() >= scores){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }*/
    }
    public int getAverage(){
        return (math + english)/2;
    }
}
