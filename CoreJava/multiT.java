package CoreJava;

public class multiT {
    public static void main(String[] args) {
        Threading thread = new Threading("Pratham Tanpure");
        Test test = new Test();

        Thread t1 = new Thread(thread);
        Thread t2 = new Thread(test);

        t1.start();
        //t2.start();
    }
}
