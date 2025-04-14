package MultiThreading;


// sleep() : Stops execution for a specific time, 
// takes argument in long, 
// surround with try/catch block

public class SleepMethod {
    public static void main(String[] args) {
        MytThread t1 = new MytThread();
        t1.start();
        try {
            Thread.sleep(3000); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(int i=0;i<5;i++) { 
            System.out.println("Parent Thread");
        }
    }
}

class MytThread extends Thread {
    @Override
    public void run(){
        for(int i=0;i<5;i++) {
            System.out.println("Child Thread");
        }
    }
}