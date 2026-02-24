package src;

import java.util.function.BiPredicate;

public class BiPredicateImpl {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = (text, number) -> {
            return text.length() > number;
        };
//        BiPredicate<String, Integer> biPredicate = (text, number) -> text.length() > number;

        System.out.println(biPredicate.test("Hello", 3));
        System.out.println(biPredicate.test("Hi", 5));
    }
}
