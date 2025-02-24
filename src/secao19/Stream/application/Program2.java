package secao19.Stream.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> streamOfNumbers = numbers.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(streamOfNumbers.toArray()));

        int sum = numbers.stream().reduce(0, (x,y) -> x + y);
        System.out.println(sum);

        List<Integer> numbersList = numbers
                .stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .collect(Collectors.toList());

        System.out.println(Arrays.toString(numbersList.toArray()));
    }
}
