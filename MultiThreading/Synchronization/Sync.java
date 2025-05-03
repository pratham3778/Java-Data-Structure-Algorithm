package MultiThreading.Synchronization;

public class Sync {
    public static void main(String[] args) {
        SyncEg obj = new SyncEg();
        Thread t1 = new Thread(() -> {
            obj.greet("Hello");
        });

        Thread t2 = new Thread(() -> {
            obj.greet("World"); 
        });


        t1.start();
        t2.start();
    }
}

class SyncEg {
    public synchronized void greet(String msg) {
        System.out.print("["+msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
}
