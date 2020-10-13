package com.tom.student;

public class GraduateStudent extends Student {
    public int thesis;
    static int pass = 70;



    public GraduateStudent(String id, String name, int english, int math, int thesis) {
        super(id, name, english, math);
        this.thesis = thesis;
    }
    @Override
    public void print() {
        System.out.print(id + "\t" + name + "\t" + english + "\t" + math + "\t" + thesis + "\t"
                + getAverage() + "\t" + (getAverage() >= pass ? "PASS" : "FAILED"));
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
        System.out.println();
    }
}


