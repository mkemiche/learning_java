package labs.pm.HomeAssignment;

import java.util.*;

/**
 * @author mkemiche
 * @created 09/04/2021
 */
public class ListInterface {

    static Iterator<String> itr= null;

    public static void main(String[] args) {

        /*
        All the class that extends List implements the same method.
         */
        System.out.println("********************  ArrayList Operation ********************");
        /*
        an arrayList can be resized dynamically.
         */
        ArrayList<String> list=new ArrayList<String>(4);
        list.add("One");
        list.add("two");
        list.add("three");
        list.add("four");
        //extend capacity for adding "five" element.
        list.add("five");
        System.out.println("Size list : " +list.size());
        itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        boolean isRemoved = list.remove("four");
        System.out.println("Element 'four' removed : "+isRemoved);
        for (String elt : list){
            System.out.println(elt);
        }
        System.out.println("Size list : " +list.size());

        /*
        create a fixed size List and don't allows us to resize these List.
         */
        var list2 = Arrays.asList(list.toArray());
        System.out.println("size of list2 : "+list2.size());
        /*
        Arrays.asList funtion create a list with fixes size like simple array
        cannot add new element because the size will change
        cannot remove an existing element bacause the list will be resized.
        but can update existing element in the list.
         */
        //try to add element
       // list2.add("twenty"); runtime Error java.lang.UnsupportedOperationException

        //try to remove element
        // var isIndexRemoved = list2.remove(0); runtime error : java.lang.UnsupportedOperationException

        //try to update existing element
        list2.set(2, "hundred"); //OK
        System.out.println("list2 updated : "+list2);



        System.out.println("********************  LinkedList Operation ********************");
        LinkedList<String> al=new LinkedList<String>();
        al.add("six");
        al.add("seven");
        al.add("eight");
        al.add("nine");
        itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        /*
        Create an immutable List using List.of() function.
         */

        var stringList = List.of("ten", "eleven", "twelve");

        //try to add new element
        // stringList.add("thirteen"); //runtime error : java.lang.UnsupportedOperationException

        //try to remove element
        //stringList.remove("thirteen");//runtime error : java.lang.UnsupportedOperationException

        //try to update  element
        //stringList.set(1, "fourtheen"); //runtime error : java.lang.UnsupportedOperationException


        System.out.println("********************  Vector Operation ********************");

        /*
        Class Vecteur is the same as ArrayList.
        Class Vector is a bit slower than ArrayList, because it is already Synchronized (thread-safe). if thread-safe is not needed, it's recommande to use ArrayList.
         */

        Vector<String> v=new Vector<String>();
        v.add("fifteen");
        v.add("sixteen");
        v.add("seventeen");
        v.add("eighteen");
        itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("********************  Stack Operation ********************");


        Stack<String> stack = new Stack<String>();
        stack.push("twentyone");
        stack.push("one");
        stack.push("four");
        stack.push("two");
        stack.push("twenty");
        stack.pop();
        itr=stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        /*
        order the list using anonymous interface comparator
        anonymous inteface used to implement interface methode
        instead to create a new class only for implement one method of an interface.
         */
        Collections.sort(stack, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) return 1;
                if(o1.length() < o2.length()) return -1;
                return 0;
            }
        });


        System.out.println("element after sortng : ");
        itr=stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
