
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class SetInterface {

    static Iterator<String> itr = null;

    public static void main(String[] args) {

        System.out.println("********************  HashSet Operation ********************");
        //Creating HashSet and adding elements
        HashSet<String> set = new HashSet<String>();
        set.add("One");
        set.add("two");
        set.add("three");
        set.add("four");
        //Traversing elements
         itr = set.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("********************  HashSet Operation ********************");
        LinkedHashSet<String> lset=new LinkedHashSet<String>();
        lset.add("six");
        lset.add("seven");
        lset.add("eight");
        lset.add("nine");
        itr=lset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        //Creating and adding elements
        TreeSet<String> tSet=new TreeSet<String>();
        tSet.add("fifteen");
        tSet.add("sixteen");
        tSet.add("seventeen");
        tSet.add("eighteen");
        //traversing elements
        itr=tSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
