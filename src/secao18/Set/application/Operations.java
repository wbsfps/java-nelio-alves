package secao18.Set.application;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.Set;

public class Operations {
    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        // union
        Set<Integer> union = new TreeSet<>(a);
        union.addAll(b);
        System.out.println(union);

        // intersection
        Set<Integer> intersection = new TreeSet<>(a);
        intersection.retainAll(b);
        System.out.println(intersection);

        // difference
        Set<Integer> differenceA = new TreeSet<>(a);
        Set<Integer> differenceB = new TreeSet<>(b);
        differenceA.removeAll(b);
        differenceB.removeAll(a);
        System.out.println(differenceA);
        System.out.println(differenceB);

    }
}
