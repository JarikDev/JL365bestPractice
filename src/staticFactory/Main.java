package staticFactory;

import java.awt.*;
import java.awt.image.ColorConvertOp;
import java.math.BigInteger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws SQLException {
        BigInteger bigInteger = new BigInteger(1, 2, new Random());
        BigInteger bigInteger1 = BigInteger.probablePrime(1, new Random());
        DriverManager.getConnection("");
    }
}

class Car {
    String color;
    int doors;

    private static Map<String, Car> cache = new HashMap<>();

    private Car(String color) {
        this.color = color;
    }

    private Car(int doors) {
        this.doors = doors;
    }

    Car() {
    }

    public static Car getSportCar() {
        return new Car(2);
    }

    public static Car getWhiteCar(String color) {
        if (cache.containsValue(color)) {
            return cache.get(color);

        }
        return cache.put(color, new Car(color));
    }

    public static Car getFerrary() {
        return new Ferrary();
    }
}

class Ferrary extends Car {

}