package com.multithreading.chapter01._1_7._4;

/**
 * @author XiangxiangLi
 * @create 2018-05-23 19:24
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(100);
            thread.interrupt();
        }catch (InterruptedException e){
            System.out.println("Main");
            e.printStackTrace();
        }

    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("Begin");
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            System.out.println("Thread");
            e.printStackTrace();
        }
    }
}