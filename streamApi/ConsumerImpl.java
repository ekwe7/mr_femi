import java.util.stream.LongStream;

public class ConsumerImpl {
    public static void main(String[] args) {
//        long start = System.nanoTime();
//        System.out.println(LongStream.rangeClosed(1, 1000000).sum());
//        long end = System.nanoTime();
//        System.out.print(end - start);


        long start = System.nanoTime();
        int sum = 0;
        for (int inedx = 0; inedx < 1000000; inedx++) {
            sum +=inedx;
        }
        System.out.println(sum);
        long end = System.nanoTime();
        System.out.println(end - start);

    }
}
