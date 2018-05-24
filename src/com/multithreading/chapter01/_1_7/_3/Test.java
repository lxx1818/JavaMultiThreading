package com.multithreading.chapter01._1_7._3;

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
        } catch (InterruptedException e) {
            System.err.println("main catch");
            e.printStackTrace();
        }
        System.out.println("***********");
    }
}



class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i <=50000000; i++) {
                if (this.isInterrupted()){
                    System.err.println("中断线程");
                    throw new InterruptedException();
                }
                System.out.println("i = "+i);
            }
            System.out.println("还有输出");
        } catch (InterruptedException e) {
            System.out.println("I am catch");
            e.printStackTrace();
        }

    }
}
