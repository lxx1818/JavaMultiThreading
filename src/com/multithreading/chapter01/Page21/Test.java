package com.multithreading.chapter01.Page21;

/**
 * @author XiangxiangLi
 * @create 2018-05-23 11:26
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println(Thread.currentThread().getName()+"\t"+System.currentTimeMillis());
        myThread.start();
        System.out.println(Thread.currentThread().getName()+"\t"+System.currentTimeMillis());
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            System.out.println(this.currentThread().getName()+"\t"+System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println(this.currentThread().getName()+"\t"+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
