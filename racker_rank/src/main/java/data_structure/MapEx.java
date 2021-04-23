package data_structure;

import java.util.*;
import java.io.*;

class MapEx {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        List<String> names = new ArrayList<>();
        int n = in.nextInt(); //contact number
        in.nextLine(); //empty line
        int i = 0;
        while (i < n) {
            String name = in.nextLine();
            String phone = in.nextLine();
            map.put(name, phone); //fill map
            i++;
        }


        while (in.hasNext()) {
            String s = in.nextLine();
            names.add(s); //fill name's list
        }


        for (int j = 0; j < names.size(); j++) {
            if (map.get(names.get(j)) != null) {
                System.out.println(names.get(j) + "=" + map.get(names.get(j)));
            } else {
                System.out.println("Not found");
            }
        }
    }
}



