package exercise;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> pairs = new HashMap<>(storage.toMap());

        for (String key : pairs.keySet()) {
            String value = pairs.get(key);
            System.out.println(key + ": " + value);
            storage.set(value, key);
            storage.unset(key);
        }
    }
}
// END