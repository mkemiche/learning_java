package labs.pm.HomeAssignment;

import java.util.*;

/**
 * @author mkemiche
 * @created 09/04/2021
 */
public class QueueInterface {

    static Iterator itr=null;
    public static void main(String[] args) {

        System.out.println("********************  PriorityQueue Operation ********************");

        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("One");
        queue.add("three");
        queue.add("two");
        queue.add("for");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        queue.remove("two");
        queue.poll();
        String peek = queue.peek();
        System.out.println("element peeked : "+peek);

        String peek2 = queue.peek();
        System.out.println("second element peeked : "+peek2);

        System.out.println("after removing two elements:");

        itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        System.out.println("********************  ArrayDeque Operation ********************");
        //Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<>();
        deque.add("six");
        deque.add("seven");
        deque.add("eight");
        deque.add("nine");

        //
        String ret = deque.peekFirst();
        System.out.println("element peeked "+ ret);

        String remove = deque.removeLast();
        System.out.println("element removed : "+remove);


        for (String str : deque) {
            System.out.println(str);
        }

    }
}
