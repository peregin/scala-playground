package jstudy;

import java.util.stream.IntStream;

public class Hoi {

    public static void main(String... args) {
        System.out.println("Hoi");

        IntStream input = IntStream.range(1, 10);
        IntStream output = input.filter((a) -> a % 2 == 0);
        log(output);
    }

    public static void log(IntStream s) {
        s.forEach(System.out::println);
    }
}
