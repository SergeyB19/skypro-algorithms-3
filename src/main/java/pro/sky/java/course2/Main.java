package pro.sky.java.course2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<User, String> result = new HashMap<>();

        result.put(new User(1, "Алеша"), "Алеша");
        result.put(new User(1, "Артур"), "Артур");
        result.put(new User(1, "Артур"), "Артур2");

        assert result != null;
    }
}