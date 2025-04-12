package CollectionFramework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;


// it is child interface of queue
// it allows element to add or remove from both ends
// implemented class are ArrayDequeue, LinkedList, etc
// methods : addFirst(), addLast(), offerFirst(), offerLast(), removeFirst() , removeLast(), pollFirst(), pollLast(), getFirst(), getLast(), peekFirst(), peekLast()


// ARRAY-DEQUEUE
// it is child class of dequeue interface
// insertion oder mentain & insertion of null is not possible
// ArrayDequeue can be implemented as Stack or Queue
// it is not thread safe
// underlying DS is resizable array

public class Dequeue_Interface {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();

        q.add(50);
        q.add(10);
        q.add(30);
        q.add(40);
        q.add(20);
        q.add(60);
      //q.add(null); //not accept null thorws null pointer exception

        System.out.println(q);
        q.addFirst(70);
        System.out.println(q);


    }
}
