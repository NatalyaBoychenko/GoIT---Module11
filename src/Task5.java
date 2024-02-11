import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {

        Stream<String> first = Stream.of("tool", "space", "common", "it", "list");
        Stream<String> second = Stream.of("1", "2", "3", "4");

        String result = zip(first, second)
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> list = new ArrayList<>();

        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();

        while (iterator1.hasNext() && iterator2.hasNext()){
            list.add(iterator1.next());
            list.add(iterator2.next());
        }

        Collections.shuffle(list);

        return list.stream();
    }
}
