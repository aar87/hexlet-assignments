package exercise;

import java.util.Comparator;
import java.util.List;

// BEGIN
class App {
    public static List<String> buildApartmentsList(List<Home> homes, int count) {
        return homes.stream()
                .sorted(Comparator.comparingDouble(Home::getArea))
                .map(Home::toString)
                .limit(count)
                .toList();
    }
}
// END
