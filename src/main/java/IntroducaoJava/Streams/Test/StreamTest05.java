package IntroducaoJava.Streams.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest05 {


    public static void main(String[] args) {
        List<String> words = List.of("Gomo", "Gomu", "no", "mi");
        String[] letters = words.getFirst().split("");
        System.out.println(Arrays.toString(letters));

        List<String[]> collect = words.stream().map(w -> w.split("")).collect(Collectors.toList());
        

    }
}
