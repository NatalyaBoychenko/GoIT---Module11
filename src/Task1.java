import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> names = List.of("Ivan", "Oleg", "Peter", "Olga", "Nick", "Alex", "Paul");

        names.stream()
                .filter(name -> (names.indexOf(name) % 2) != 0)
                .map(name -> names.indexOf(name) + ". " + name)
                .forEach(System.out::println);
    }
}
