package CoreJava;
//sleep :-  to stop the execution for a specific time
//join  :- to join another thread after completion of current thread


class numTest extends Thread {
    @Override
    public void run() { 
        for(int i=1;i<=10;i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.print(i);
        }
    }
}

public class multiThread extends Thread {
    String s = "Pratham Tanpure";

    @Override
    public void run() {
        char c[] = s.toCharArray();
        
        for(int i=0;i<c.length;i++) {
            try {
                Thread.sleep(500); //1000 milisec = 1 sec
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.print(c[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception{
        multiThread mt = new multiThread();
        mt.start();
        mt.join();
        numTest t1 = new numTest();
        t1.start();
    }
    
}
