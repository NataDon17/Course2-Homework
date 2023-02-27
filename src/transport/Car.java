package transport;

import java.util.List;

public class Car<T extends DriverCategoryB> extends Transport implements Competing, Cloneable {

    enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбэк"),
        COUPE("Купе"),
        STATION_WAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP_TRUCK("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        public String getBodyType() {
            return bodyType;
        }

        public void setBodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + getBodyType();
        }
    }

    private BodyType bodyType;

    public Car(String brand,
               String model,
               double engineVolume,
               BodyType bodyType,
               List<Mechanic> mechanics) {
        super(brand, model, engineVolume, mechanics);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    void startMoving() {
        System.out.println("Автомобиль " + getBrand() + " начинает движение");
    }

    @Override
    void endMoving() {
        System.out.println("Автомобиль " + getBrand() + "заканчивает движение");
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
    void getType() {
        System.out.println(Type.CAR);
    }

    @Override
    void printType() {
        if (getBodyType() == null) {
            System.out.println(getBrand() + ": " + "Данных по транспортному средству недостаточно.");
        } else {
            System.out.println(getBrand() + ": " + getBodyType());
        }
    }

    @Override
    void passDiagnostics() {
        System.out.println(getBrand() + ": Легковой автомобиль должен пройти диагностику");
    }

    @Override
    public String toString() {
        return "Car: " + super.toString() + ", " + bodyType;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
