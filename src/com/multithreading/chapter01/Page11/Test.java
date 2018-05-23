package com.multithreading.chapter01.Page11;

public class Test {
    public static void main(String[] args) {
        MyThread2 myThread = new MyThread2();
        Thread a = new Thread(myThread, "A");
        Thread b = new Thread(myThread, "B");
        Thread c = new Thread(myThread, "C");
        Thread d = new Thread(myThread, "D");
        Thread e = new Thread(myThread, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();

    }
}


class MyThread extends Thread {
    private int count = 5;

    @Override
    public void run() {
        super.run();
//        while (count>0){
        count--;
        System.out.println(this.currentThread().getName() + "\tcount = " + count);
//        }
    }
}

class MyThread2 extends Thread {
    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
//        while (count>0){
        count--;
        System.out.println(this.currentThread().getName() + "\tcount = " + count);
//        }
    }
}