package secao18.tiposCuringa.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("program");
        list.add('l');
        list.add(10);

        Program.printList(list);
        System.out.println("-");
        List<Integer> ints = Arrays.asList(1,2,3);
        Program.printList(ints);

        List<String> names = Arrays.asList("Alex", "Bob", "Maria");

        Program.printList(names);
    }

    public static void printList(List<?> list) {
        // list.add(3);
        for (Object object : list) {
            System.out.println(object);
        }
    }
}
