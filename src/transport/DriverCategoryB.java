package transport;

public class DriverCategoryB<T extends Car> extends Driver {
    public DriverCategoryB(String fullName, boolean validDriversLicense, double experienceDriving) {
        super(fullName, validDriversLicense, experienceDriving);
    }

    @Override
    void startMoving() {
        System.out.println("Водитель автомобиля начинает движение");
    }

    @Override
    void endMoving() {
        System.out.println("Водитель автомобиля заканчивает движение");
    }

    @Override
    void refuelTransport() {
        System.out.println("Водитель заправляет автомобиль");
    }

    public String getCarMessage(T car) {
        return "Водитель категории В " + getFullName() +
                " управляет л/а " + car.getBrand() + " " + car.getModel() +
                " и будет участвовать в заезде.";
    }
}
