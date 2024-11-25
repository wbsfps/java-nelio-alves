package secao18.Set.application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("Notebook"));
        for (String p : set) {
            System.out.println(p);
        }
        System.out.println();

        set = new TreeSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");
        for (String p : set) {
            System.out.println(p);
        }

        System.out.println();

        set = new LinkedHashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        set.remove("Tablet");
        set.removeIf(x -> x.charAt(0) == 'T');
        for (String p : set) {
            System.out.println(p);
        }
    }
}
