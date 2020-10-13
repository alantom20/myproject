package com.tom.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
       HashMap<String,String> map = new HashMap();
       map.put("2301","台積電");
       map.put("2354","鴻海");
       map.put("2301","TSMC");
       System.out.println(map);
       System.out.println(map.get("2301"));
       for(String s : map.keySet()){
           System.out.println(map.get(s));
       }


        //setList();
        //arrayTest();
        //listTest();


    }

    private static void setList() {
        HashSet<Integer> set = new HashSet();
        set.add(24);
        set.add(43);
        set.add(54);
        set.add(78);
        System.out.println(set);
        for (Integer n : set) {
            System.out.println(n);
        }
    }

    private static void listTest() {
        ArrayList<Integer> list = new ArrayList();
        list.add(10);
        list.add(30);
        list.add(1);
        list.add(52);
        list.add(4);
        System.out.println(list);
        int i = list.get(0);
        List<Integer> score = Arrays.asList(20,30,40,50,60);
        System.out.println(score.get(0));
    }

    private static void arrayTest() {
        int[] number = new int[5];
        number[0] = 5;
        number[1] = 82;
        number[2] = 24;
        number[3] = 26;
        number[4] = 52;
        int[] score ={85,64,84,45,64};
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
        for (int i : number) {
            System.out.println(i);
        }
    }
}
