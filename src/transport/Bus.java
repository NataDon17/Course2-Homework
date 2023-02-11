package transport;

public class Bus extends Transport {
    static int counter = 0;

    public Bus(String brand,
               String model,
               int productionYear,
               String productionCountry,
               String bodyColor,
               double maxSpeed) {
        super(brand, model, productionYear, productionCountry, bodyColor, maxSpeed);
        counter++;
    }

    @Override
    public String toString() {
        return "Bus " + super.toString();
    }
}
