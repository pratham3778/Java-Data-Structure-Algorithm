package MultiThreading.Synchronization;


// When two or more threads are block, where each threads are waiting for other's lock. None of the thread can run until the other gives up its lock. So they will sit forever.
// we can coid deadlock using lock ordering
public class ThreadDeadlock {

    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized(resource1) {
                System.out.println("Thread 1: Holding resource 1...");
                try {
                    Thread.sleep(1000);
                } catch(Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Waiting resource 2...");
                synchronized(resource2) {
                    System.out.println("thread 1: Holding resource 1 and 2...");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized(resource2) { //to avoid deadlock - synchronized(resource1)
                System.out.println("Thread 2: Holding resource 2...");
                try {
                    Thread.sleep(1000);
                } catch(Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Waiting resource 1...");
                synchronized(resource1) {
                    System.out.println("thread 2: Holding resource 1 and 2...");
                }
            }
        });

        t1.start();
        t2.start();
        
    }
}
