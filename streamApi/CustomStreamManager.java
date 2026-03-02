import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CustomStreamManager {
    public static void main(String[] args) {
        //Obtain stream from collection
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(numbers.stream()
                .reduce(Integer::sum));


        //Array.stream(T[])
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.stream(nums).average().orElseThrow());

        //stream.of()
        Stream.of(20,30,20,40,50,60,70,80,90,100)
                .forEach(System.out::println);

        //Infinite stream
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }
}
