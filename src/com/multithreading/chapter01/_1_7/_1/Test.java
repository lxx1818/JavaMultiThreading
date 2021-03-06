package com.multithreading.chapter01._1_7._1;

/**
 * @author XiangxiangLi
 * @create 2018-05-23 11:42
 * @Description
 */
public class Test {
    public static void main(String[] args)  {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i <=5000000; i++) {
            System.out.println("i = "+ i);
        }
    }
}
