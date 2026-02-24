package src;

import java.util.function.Predicate;

public class PredicateImpl {
    public static void main(String[] args) {
        Predicate<String> predicate = (text) -> {
            return text.length() > 5;
        };

        System.out.println(predicate.test("Hello"));
        System.out.println(predicate.test("Semicolon"));
    }
}

