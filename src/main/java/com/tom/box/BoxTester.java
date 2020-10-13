package com.tom.box;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Please enter object's length: ");
        Float length = scanner.nextFloat();
        System.out.print("Please enter object's width: ");
        Float width = scanner.nextFloat();
        System.out.print("Please enter object's height: ");
        int height = scanner.nextInt();
        Box3 box3 = new Box3();
        if(box3.validate(length,width,height)){
            System.out.println("可以容納BOX3");
        }else{
            System.out.println("無法容納BOX3");
        }
        Box5 box5 = new Box5();
        if(box5.validate(length,width,height)){
            System.out.println("可以容納BOX5");
        }else{
            System.out.println("無法容納BOX5");
        }





    }
}
