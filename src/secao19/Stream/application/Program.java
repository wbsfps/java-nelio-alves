package secao19.Stream.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4);
        Stream<Integer> streamOfNumbers = numbers.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(streamOfNumbers.toArray()));

        Stream<String> streamOfStrings = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(streamOfStrings.toArray()));

        Stream<Integer> streamIteratorNumbers = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(streamIteratorNumbers.limit(10).toArray()));

        Stream<Long> streamIteratorLongs = Stream
                .iterate(new Long[] {0L, 1L}, p -> new Long[] { p[1], p[0] + p[1] }).map(p -> p[0]);

        System.out.println(Arrays.toString(streamIteratorLongs.limit(10).toArray()));
    }
}
