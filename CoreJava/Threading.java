package CoreJava;
// Multithreading : 
// - Process of executing multiple threads simultaneously is called
// - Thread are subpart of process
// - Thread is light weighted whereas process is highlyweighted
// - Multitasking and Multithreading both are used to acheive multitasking
// - CREATING A THREAD : (1) By extending the thread class - part of java.lang package
//                       (2) By implementing Runnable interface - "same"

public class Threading implements Runnable{
    String msg;
    public Threading(String msg) {
        this.msg = msg;
    }
    @Override
    public void run() {
        for(char c : msg.toCharArray()) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.print(c);
        }
    }

    // @Override
    // public void run() {
    //    for(int i=1;i<=10;i++) {
    //     try{
    //         Thread.sleep(1000);
    //     } catch(Exception e) {
    //         e.printStackTrace();
    //     }
    //     System.out.println("Ascending: " + i);
    //    }
    // }
     
}

class Test implements Runnable {
    @Override
    public void run() {
        for(int i=10;i>=1;i--) {
        try{
            Thread.sleep(2000);
        } catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("Descending: " + i);
       }
    }
}
