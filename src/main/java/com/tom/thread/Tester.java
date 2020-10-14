package com.tom.thread;

public class Tester {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread : " + i);
            Thread.sleep(50);
        }

        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread" + i);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
        MyThread myThread = new MyThread();
        myThread.start();

        new Thread(() ->{
            for (int i = 0; i < 10; i++) {
                System.out.println("Runnable: " + i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        System.out.println("main end");
    };

}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + i);
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}