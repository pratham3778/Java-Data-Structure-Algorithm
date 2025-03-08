package CoreJava;

@FunctionalInterface
interface LambdaExptest {
    //by default interface methods are abstarct
    //you can write public abstract void m1(); OR 
    //eg1 :- 
    //void m1();

    //eg2 :-
    //void add(int a, int b);

    //eg3 :-
    int addition(int a, int b);

    
}
public class LambdaExp{
    /* instead of doing this use L.E
    @Override
    public void m1() {
        System.out.println("Hello");
    } */

    public static void main(String[] args) {
        // instead of doing this use L.E
        //LambdaExp l = new LambdaExp();
        //l.m1();

        //do this eg1:-
        //LambdaExptest t1 = () -> System.out.println("Hello");
        //t1.m1();

        //eg2 :-
        //LambdaExptest test = (int a, int b) -> System.out.println("Addition is: " + (a+b));
        //test.add(10, 20);

        //eg 3: -
        LambdaExptest sum = (a,b) -> a + b;
        System.out.println("Sum is: " + sum.addition(10, 30));
    }
}
