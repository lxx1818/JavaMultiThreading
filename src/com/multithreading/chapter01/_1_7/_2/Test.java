package com.multithreading.chapter01._1_7._2;

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
            Thread.sleep(20);
            thread.interrupt();
            System.err.println("是否停止1："+thread.isInterrupted());
            System.err.println("是否停止1："+thread.isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i <=50000000; i++) {
            System.out.print("");
        }
    }
}
