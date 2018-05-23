package com.multithreading.chapter01.Page16;

/**
 * @author XiangxiangLi
 * @create 2018-05-23 10:15
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
//        thread.run();

        thread.start();

    }
}

class MyThread extends Thread{
    public MyThread(){
        System.out.println("构造函数:"+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        super.run();
        System.out.println("RUN:"+Thread.currentThread().getName());
    }
}