package src;

import java.util.function.Function;

public class FunctionImpl {
    public static void main(String[] args) {
//        Function<String, Integer> function = (String text) -> text.length();
        Function<String, Integer> function = String::length;

        System.out.println(function.apply("hello Semicolon"));
    }
}
