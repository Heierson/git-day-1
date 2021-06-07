import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> movieList = List.of("Shrek", "Star Wars", "Avengers");

        List<String> toUpperCase = stringsToUpperCase(movieList);

        toUpperCase.forEach(System.out::println);

        List<String> sortedList = sortList(toUpperCase);

        sortedList.forEach(System.out::println);

        List<String> toLowerCase = stringToLowerCase(movieList);

        toLowerCase.forEach(System.out::println);
    }

    private static List<String> stringsToUpperCase(List<String> movieList) {
        return movieList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    private static List<String> stringToLowerCase(List<String> movieList) {
        return movieList.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

    private static List<String> sortList(List<String> movieList) {
        return  movieList.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
