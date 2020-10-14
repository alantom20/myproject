package com.tom.io;

import java.io.*;

public class ReadTester {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String n = br.readLine();
            while(n != null){
                System.out.println(n);
                n = br.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //fileReader();
        // inputstream();
    }

    private static void fileReader() {
        try {
            FileReader fr = new FileReader("data.txt");
            int n = fr.read();
            while(n != -1){
                System.out.print((char)n);
                n= fr.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void inputstream() {
        File file = new File("data.txt");
        System.out.println(file.getAbsoluteFile());
        try {
            InputStream is = new FileInputStream(file);
            int n = is.read();
            while(n != -1){
                System.out.print((char)n);
                n = is.read();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("錯誤");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
