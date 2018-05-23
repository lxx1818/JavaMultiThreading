package com.multithreading.chapter01.Page14;

/**
 * @author XiangxiangLi
 * @create 2018-05-22 19:31
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t[] = new Thread[5];
        for (int i = 0; i <5 ; i++) {
            t[i] = new Thread(myThread);
        }
        for (int i = 0; i < 5; i++) {
            t[i].start();
        }
    }
}

class MyThread extends Thread{
    private int count = 5;
    @Override
    public void run() {
        super.run();
        System.out.println("count = "+count--+"\t"+Thread.currentThread().getName());
    }
}
