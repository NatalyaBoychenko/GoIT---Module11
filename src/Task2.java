import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<String> names = List.of("Ivan", "Oleg", "Peter", "Olga", "Nick", "Alex", "Paul");

        names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
