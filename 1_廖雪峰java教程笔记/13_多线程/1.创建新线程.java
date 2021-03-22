// java内置了多线程支持

public class Main{
    // main函数本身是一个线程，主线程
    public static void main(String[] args){
        // Thread t = new Thread();
        // Thread t = new MyThread();
        Thread t = new Thread(new MyRunnable()); //创建Thread实例时，传入一个Runnable实例
        t.setPriority(10);//1~10,默认值5

        // 使用java8引入的lambda语法进一步简写
        Thread s = new Thread(()-> {
            System.out.println("start new thread s!");
        });
        s.setPriority(1);//1~10,默认值5

        t.start(); //启动新线程
        s.start(); //启动新线程

        // 线程的优先级设定
        t.setPriority(1);//1~10,默认值5
        s.setPriority(10);
        /**
        优先级高的线程被操作系统调度的优先级较高，操作系统对高优先级线程可能调度更频繁，
        但我们决不能通过设置优先级来确保高优先级的线程一定会先执行。
         */
    }
}

class MyThread extends Thread {
    // 重写：子类对父类的允许访问的方法的实现过程进行重新编写，返回值和形参都不能改变。（外壳不变，核心重写）
    @Override
    public void run(){
        System.out.println("start new thread!");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("start new thread t!");
    }
}