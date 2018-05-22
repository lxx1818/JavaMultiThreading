package com.multithreading.chapter01.Page9;

public class Test {
    public static void main(String[] args) {

        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");
        a.start();
        b.start();
        c.start();

    }
}


class MyThread extends Thread{
    private int count = 5;

    public MyThread(String name){
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count>0){
            count--;
            System.out.println(this.currentThread().getName()+"\tcount = "+count);
        }
    }
}