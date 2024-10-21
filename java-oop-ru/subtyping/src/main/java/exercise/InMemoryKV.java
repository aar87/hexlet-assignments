package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
class InMemoryKV implements KeyValueStorage {
    private final Map<String, String> values;

    public InMemoryKV(Map<String, String> values) {
        this.values = new HashMap<>(Map.copyOf(values));
    }

    @Override
    public void set(String key, String value) {
        this.values.put(key, value);
    }

    @Override
    public void unset(String key) {
        this.values.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        if (this.values.containsKey(key)) {
            return this.values.get(key);
        }

        return defaultValue;
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(this.values);
    }
}
// END
