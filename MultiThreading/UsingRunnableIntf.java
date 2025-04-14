package MultiThreading;

public class UsingRunnableIntf {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t1 = new Thread(r);
        t1.start();
        for(int i=0;i<10;i++) { 
            System.out.println("Parent Thread");
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run(){
        for(int i=0;i<10;i++) {
            System.out.println("Child Thread");
        }
    }
}