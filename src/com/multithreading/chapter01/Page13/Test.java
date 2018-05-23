package com.multithreading.chapter01.Page13;

/**
 * @author XiangxiangLi
 * @create 2018-05-22 19:17
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        ALogin a = new ALogin();
        BLogin b = new BLogin();
        a.start();
        b.start();
    }
}

class LoginServlet {
    private static String username;
    private static String password;

    public static void doPost(String name,String pass){
        try {
            username = name;
            if (username.equals("a")){
                Thread.sleep(1000);
            }
            password = pass;
            System.out.println(username+"\t"+password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class ALogin extends Thread{
    @Override
    public void run() {
        super.run();
        LoginServlet.doPost("a","aaaaa");
    }
}

class BLogin extends Thread {
    @Override
    public void run() {
        super.run();
        LoginServlet.doPost("b", "bbbbbb");
    }

}