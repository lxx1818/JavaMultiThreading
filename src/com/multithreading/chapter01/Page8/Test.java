package com.multithreading.chapter01.Page8;

public class Test {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("End!!");
    }
}


class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Running!");
    }
}