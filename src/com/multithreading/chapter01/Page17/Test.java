package com.multithreading.chapter01.Page17;

/**
 * @author XiangxiangLi
 * @create 2018-05-23 10:22
 * @Description
 */
public class Test {

    public static void main(String[] args) {

        CountOpreate countOpreate = new CountOpreate();
        Thread thread = new Thread(countOpreate,"A");
        Thread thread1 = new Thread(countOpreate);
        thread.start();
        thread1.start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        countOpreate.setName("C");
        countOpreate.start();
    }
}

class CountOpreate extends Thread {
    public CountOpreate() {
        System.out.println("构造Thread:"+Thread.currentThread().getName());
        System.out.println("构造Name:"+this.getName());
    }
    @Override
    public void run() {
        super.run();
        System.out.println("RUN Thread:"+Thread.currentThread().getName());
        System.out.println("RUN Name:"+this.getName());
    }
}