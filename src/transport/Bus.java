package transport;

public class Bus extends Transport implements Competing {

    public Bus(String brand,
               String model,
               double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void startMoving() {
        System.out.println("Автобус "+getBrand()+" начинает движение");
    }

    @Override
    void endMoving() {
        System.out.println("Автобус "+getBrand()+" заканчивает движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Остановка автобуса на пит-стоп");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость среди автобусов: ");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга среди автобусов: ");
    }

    @Override
    public String toString() {
        return "Bus " + super.toString();
    }
}
