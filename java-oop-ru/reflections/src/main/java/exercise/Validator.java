package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public final class Validator {

    public static List<String> validate(Object object) {
        List<String > inValidFields = new ArrayList<>();

        for (Field field : object.getClass().getDeclaredFields()) {
            if (field.getAnnotation(NotNull.class) != null) {
                field.setAccessible(true);
                try {
                    String fieldName = field.getName();
                    if (field.get(object) == null) {
                        inValidFields.add(fieldName);
                    }
                } catch (IllegalAccessException e) {
                }
            }
        }

        return inValidFields;
    }
}
// END
