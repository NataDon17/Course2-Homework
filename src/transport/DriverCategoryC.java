package transport;

public class DriverCategoryC<T extends Bus> extends Driver {
    public DriverCategoryC(String fullName, boolean validDriversLicense, double experienceDriving) {
        super(fullName, validDriversLicense, experienceDriving);
    }

    @Override
    void startMoving() {
        System.out.println("Водитель автобуса начинает движение");
    }

    @Override
    void endMoving() {
        System.out.println("Водитель останавливает автобус");
    }

    @Override
    void refuelTransport() {
        System.out.println("Водитель заправляет автобус");
    }

    public String getCarMessage(T bus) {
        return "Водитель категории С " + getFullName() + " управляет автобусом " + bus.getBrand() + " " + bus.getModel() + " и будет участвовать в заезде.";
    }
}
