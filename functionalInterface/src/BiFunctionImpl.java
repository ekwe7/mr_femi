package src;

import java.util.function.BiFunction;

public class BiFunctionImpl {
    public static void main(String[] args) {
        BiFunction<String, String, String> biFunction = (text1, text2) -> {
            System.out.println("Hello" + text1 + " : " + text2);
            return text1 + " : " + text2;
        };
    };


}
