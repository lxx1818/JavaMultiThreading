package com.multithreading.chapter01.Page18;

/**
 * @author XiangxiangLi
 * @create 2018-05-23 10:50
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("begin:"+myThread.isAlive());
        myThread.start();
        System.out.println("end:"+myThread.isAlive());

    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("RUN:"+this.isAlive());
    }
}