package MultiThreading;


// yeild() : it cause a current running thread to pause and allow other thread of same priority to execute

public class YeildMethod {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i=0;i< 10;i++) {
                System.out.println("Thread 1 Execution: " + i);
                Thread.yield();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0;i< 10;i++) {
                System.out.println("Thread 2 Execution: " + i);
                Thread.yield();
            }
        });

        t1.start();
        t2.start();
    }
}
