package MultiThreading;


// join() : method used to wait for a thread to complete and then execute another

public class JoinMethod {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i=0;i< 10;i++) {
                System.out.println("Thread 1 Execution: " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                t1.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
            for(int i=0;i< 10;i++) {
                System.out.println("Thread 2 Execution: " + i);
            }
        });

        t1.start();
        t2.start();
    }
}
