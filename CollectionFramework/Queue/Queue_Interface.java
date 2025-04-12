package CollectionFramework.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

// Queue is child interface of Collection
// The behavious of the queue is FIFO
// mehtods : add(), offer(), remove(), poll(), element(), peek()


//PRIORITY QUEUE
// we know queue is FIFO, but in some scenario we want to process queue based on their proirity, then we can use PQ
// it is child interface of Queue
// Insertion of null is not possible
// uderlying DS is binary heap.
// it is not thread safe
// the element is PQ must be of comparable type as it priortizes them based on natural sorting oder by defualt
// using a comparator we can customized the priority according to specific criteria


public class Queue_Interface {
    public static void main(String[] args) {
        // Queue<Integer> q = new PriorityQueue<>();
        Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());

        q.add(20);
        q.add(70);
        q.add(10);
        q.add(80);

        System.out.println(q); //not guarentee sorted order

        while (!q.isEmpty()) {
            System.out.println(q.poll()); //guarentee sorted order
        }
        System.out.println();
    }
}
