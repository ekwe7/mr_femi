package src;

import java.util.function.UnaryOperator;

public class UnaryImpl {
    public static void main(String[] args) {

//        UnaryOperator<String> unary = (value) -> {
//            return value.toUpperCase();
//        };
        UnaryOperator<String> unary = String::toUpperCase;

//        UnaryOperator<String> unary = text -> text.toUpperCase();

        System.out.println(unary.apply("hello Semicolon"));
    }
}
