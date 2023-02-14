package transport;

public class Car extends Transport implements Competing {

    public Car(String brand,
               String model,
               double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    void startMoving() {
        System.out.println("Автомобиль " +getBrand()+" начинает движение");
    }

    @Override
    void endMoving() {
        System.out.println("Автомобиль "+getBrand()+"заканчивает движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Остановка л/а на пит-стоп");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость среди л/а: ");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга среди л/а: ");
    }

    @Override
    public String toString() {
        return "Car: " + super.toString();
    }
}