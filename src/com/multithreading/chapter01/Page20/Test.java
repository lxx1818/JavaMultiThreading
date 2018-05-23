package com.multithreading.chapter01.Page20;

/**
 * @author XiangxiangLi
 * @create 2018-05-23 11:13
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread,"A");
        thread.start();
    }
}

class MyThread extends Thread{

    public MyThread(){
        System.out.println("Thread.currentThread().getName():"+this.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive():"+Thread.currentThread().isAlive());
        System.out.println("this.getName():"+this.getName());
        System.out.println("this.isAlive():"+this.isAlive());
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Thread.currentThread().getName():"+Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive():"+Thread.currentThread().isAlive());
        System.out.println("this.getName():"+this.getName());
        System.out.println("this.isAlive():"+this.isAlive());
    }
}