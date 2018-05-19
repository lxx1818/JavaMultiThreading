package com.multithreading.chapter01.Page6;

/**
 * @author XiangxiangLi
 * @create 2018-05-18 11:18
 * @Description
 */
public class Test_page6 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main = " + Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("run = " + Thread.currentThread().getName());
            }
        }catch (InterruptedException e) {
                e.printStackTrace();
        }
    }
}