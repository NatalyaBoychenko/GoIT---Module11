import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {

        String[] numbers = new String[]{"1, 2, 0", "4, 5"};

        String result = Stream.of(numbers)
                .map(s -> s.split(", "))
                .flatMap(Arrays::stream)
                .sorted()
                .collect(Collectors.joining(", ", "\"", "\""));

        System.out.println(result);
    }
}
