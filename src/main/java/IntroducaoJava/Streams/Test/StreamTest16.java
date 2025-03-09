package IntroducaoJava.Streams.Test;
//LIMIT,FINDFIRST não recomendado usar parallel
//findAny sim
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
        long num = 10_000_000;
        sumFor(num);
        sumStreamIterate(num);
        parallelStreamIterate(num);
        longStreamIterate(num);
        ParallelLongStreamIterate(num);
    }

    private static void sumFor(long num) {
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++) {
            result += 1;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    private static void sumStreamIterate(long num) {
        System.out.println("Sum StreamIterate");
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    private static void parallelStreamIterate(long num) {
        System.out.println("Parallel Stream");
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    private static void longStreamIterate(long num) {
        System.out.println("Long Stream");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");

    }

    private static void ParallelLongStreamIterate(long num) {
        System.out.println("sumParallel Long Stream");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");

    }
}

