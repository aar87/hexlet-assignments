package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

// BEGIN
@Data
@Value
@Builder
@NoArgsConstructor(force = true)
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    public Car(int id, String brand, String model, String color, User owner) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.owner = owner;
    }

    public String serialize() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return "";
        }
    }

    public static Car deserialize(String json) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            List<Car> listCar = objectMapper.readValue(json, new TypeReference<List<Car>>(){});
            return objectMapper.readValue(listCar.get(0).serialize(), Car.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    // END
}
