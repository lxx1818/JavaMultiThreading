package com.multithreading.chapter01.Page7;

/**
 * @author XiangxiangLi
 * @create 2018-05-18 11:46
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        MyThread t[] = new MyThread[15];
        for (int i = 0; i < 15; i++) {
            t[i] = new MyThread(i);
        }
        for (int i = 0; i < 15; i++) {
            t[i].start();
        }

    }
}

class  MyThread extends Thread{
    private int i;
    public MyThread(int i){
        super();
        this.i = i;
    }
    @Override
    public void run() {
        super.run();
        System.out.println(i);
    }
}