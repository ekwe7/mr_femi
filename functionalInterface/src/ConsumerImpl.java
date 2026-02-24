package src;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerImpl {
    public static void main(String[] args) {
        Consumer<String> consumer = (String x) -> {
            System.out.println("Consumer " + x);
        };
        consumer.accept("Hello ...");

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.forEach(System.out::println);
    }
}
