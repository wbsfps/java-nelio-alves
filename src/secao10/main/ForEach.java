package secao10.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        String[] vect = new String[]{"Maria", "Bob", "Alex"};
        List<String> names = new ArrayList<>(Arrays.asList("Maria", "Bob", "Alex"));

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        System.out.println();
        for (String name : vect) {
            System.out.println(name);
        }
        System.out.println();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
