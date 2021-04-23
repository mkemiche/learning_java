package data_structure;

import java.io.*;
import java.util.*;

public class ListEx {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = Integer.valueOf(sc.next()); //get size of list
        int i = 0;
        List list = new ArrayList<>(size);
        while (i < size) {
            list.add(sc.next()); //fill the list
            i++;
        }

        int j = 0;
        int q = Integer.valueOf(sc.next()); //number of queries
        while (j < q) {
            String op = sc.next(); //first operation insert and second operation remove
            if (op.equals("Insert")) {
                int idx = Integer.parseInt(sc.next());
                int val = Integer.valueOf(sc.next());
                list.add(idx, val);
            }
            if (op.equals("Delete")) {
                int idx = Integer.valueOf(sc.next());
                list.remove(idx);

            }
            j++;
        }
        for (int k = 0; k < list.size(); k++) {
            System.out.print(list.get(k) + " "); //display the list.
        }

    }
}

