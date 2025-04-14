package MultiThreading.Synchronization;

// Object class has three method wait() , notify(), notifyAll(), and that helps thread communicate the status of an event
// wait(): tells the calling thread to give up the execution and go to sleep until some other thread calls notify() or notifyAll() method.
// notify(): Wakes up a thread that called wait() method on the same object.
// notifyAll(): Wakes up all the threads that called wait() method on the same object. One of the thread will be guaranteed access.

public class ThreadInteraction {
    public static void main(String[] args) {
        Restaurant res = new Restaurant();
        Thread chefThread = new Thread(() -> {
            res.prepareDish("Pizza");
        });

        Thread waiterThread = new Thread(() -> {
            res.serveDish("Pizza");
        });

        chefThread.start();
        waiterThread.start();
    }
}

class Restaurant {
    private boolean dishReady = false;

    //prepare dish
    public synchronized void prepareDish(String dishName) {
        for(int i=0;i<10;i++) {
            while (dishReady) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            System.out.println("Chef prepared " + dishName + " - Iteration " + (i + 1));
            dishReady = true;
            notify();
        }
    }

    //serve dish
    public synchronized void serveDish(String dishName){
        for (int i = 0; i < 10; i++) {
            while (!dishReady) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            System.out.println("Waiter served " + dishName + " - Iteration " + (i+1));
            dishReady=false;
            notify();
        }
    }
}
