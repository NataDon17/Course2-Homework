package transport;

public class DriverCategoryD<T extends Truck> extends Driver {
    public DriverCategoryD(String fullName, boolean validDriversLicense, double experienceDriving) {
        super(fullName, validDriversLicense, experienceDriving);
    }

    @Override
    void startMoving() {
        System.out.println("Водитель грузовика начинает движение");
    }

    @Override
    void endMoving() {
        System.out.println("Водитель останавливает грузовик");
    }

    @Override
    void refuelTransport() {
        System.out.println("Водитель заправляет грузовик");
    }

    public String getCarMessage(T truck) {
        return "Водитель категории D " + getFullName() +
                " управляет грузовиком " + truck.getBrand() + " " + truck.getModel() +
                " и будет участвовать в заезде.";
    }
}
