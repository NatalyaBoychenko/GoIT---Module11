import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {

        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);

        generate(a, c, m)
                .forEach(System.out::println);
    }

    public static Stream<Long> generate(long a, long c, long m){
        return Stream.iterate(0L, seed -> (a * seed + c) % m);
    }

}
