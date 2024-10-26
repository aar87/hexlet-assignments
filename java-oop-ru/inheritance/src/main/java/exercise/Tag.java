package exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public abstract class Tag {
    String name;
    Map<String, String> attributes;

    public Tag(String name, Map<String, String> attributes) {
        this.name = name;
        this.attributes = new LinkedHashMap<>(attributes);
    }

    String getName() {
        return this.name;
    }

    Map<String, String> getAttributes() {
        return this.attributes;
    }
}
// END
