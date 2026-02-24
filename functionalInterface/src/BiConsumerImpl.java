package src;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerImpl {
    public static void main(String[] args) {
        BiConsumer<String,  String> biConsumer = (a,b) -> {
            System.out.println("BiConsumer " + a + b);
        };
        biConsumer.accept("Hello ","Semicolon");
        Map<String, Integer> map = Map.of(
                "ONE", 1,
                "TWO", 2,
                "THREE", 3
        );
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
