package MultiThreading;

public class UsingExtendsClass {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        for(int i=0;i<10;i++) { 
            System.out.println("Parent Thread");
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run(){
        for(int i=0;i<10;i++) {
            System.out.println("Child Thread");
        }
    }
}


// when we use t1.run() it will excute the sub class first and then the parent
// but when we use t1.start() it will execute mix results