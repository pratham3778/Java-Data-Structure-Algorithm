package MultiThreading;

public class SetNameNSetPriority {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("Running Thread: " + Thread.currentThread().getName() + " , Priority: " + Thread.currentThread().getPriority());

        };

        Thread t1 = new Thread(r);
        t1.setName("Pratham");
        t1.setPriority(Thread.MIN_PRIORITY);

        Thread t2 = new Thread(r);
        t2.setName("Aadi");
        t2.setPriority(Thread.MAX_PRIORITY);


        t1.start();
        t2.start();
    }
}
