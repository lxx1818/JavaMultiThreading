package com.multithreading.chapter01.Page5;

/**
 * @author XiangxiangLi
 * @create 2018-05-18 3:10
 * @Description
 */
public class Test_page5 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("运行结束！");
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}