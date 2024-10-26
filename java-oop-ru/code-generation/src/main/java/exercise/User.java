package exercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

// BEGIN
@Data
@AllArgsConstructor
@Value
// END
class User {
    int id;
    String firstName;
    String lastName;
    int age;
}
