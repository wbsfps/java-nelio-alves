package secao18.tiposCuringaDelimitado.problema2GetPut.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Object> objs = new ArrayList<>();
        List<Integer> ints = Arrays.asList(1,2,3,4);
        List<Double> doubles = Arrays.asList(3.14, 6.28);

        copy(ints, objs);
        copy(doubles, objs);

        printList(objs);
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }
    }

    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
