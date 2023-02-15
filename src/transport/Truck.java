package transport;

public class Truck extends Transport implements Competing {

    public Truck(String brand,
                 String model,
                 double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void startMoving() {
        System.out.println("Грузовик "+getBrand()+" начинает движение");
    }

    @Override
    void endMoving() {
        System.out.println("Грузовик "+getBrand()+" заканчивает движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Остановка г/а на пит-стоп");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость среди г/а: ");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга среди г/а: ");
    }

    @Override
    public String toString() {
        return "Truck: " + super.toString();
    }
}
