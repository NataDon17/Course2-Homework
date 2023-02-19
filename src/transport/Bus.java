package transport;

import java.io.IOException;

public class Bus extends Transport implements Competing {

    enum Capacity {
        EXTRA_SMALL(10, null),
        SMALL(25, null),
        MEDIUM(50, 25),
        LARGE(80, 50),
        EXTRA_LARGE(120, 80);

        private Integer lowerLimit;
        private Integer upperLimit;

        Capacity(Integer upperLimit, Integer lowerLimit) {
            this.lowerLimit = lowerLimit;
            this.upperLimit = upperLimit;
        }

        public Integer getUpperLimit() {
            return upperLimit;
        }

        public void setUpperLimit(Integer upperLimit) {
            this.upperLimit = upperLimit;
        }

        public Integer getLowerLimit() {
            return lowerLimit;
        }

        public void setLowerLimit(Integer lowerLimit) {
            this.lowerLimit = lowerLimit;
        }

        @Override
        public String toString() {
            if (lowerLimit == null)
                return "Вместимость автобуса: до " + getLowerLimit() + " человек.";
            else if (upperLimit == null)
                return "Вместимость автобуса: от " + getLowerLimit() + " человек.";
            else
                return "Вместимость автобуса: от " + getLowerLimit() + " до " + getUpperLimit() + " человек.";
        }
    }

    private Capacity capacity;

    public Bus(String brand,
               String model,
               double engineVolume,
               Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    void startMoving() {
        System.out.println("Автобус " + getBrand() + " начинает движение");
    }

    @Override
    void endMoving() {
        System.out.println("Автобус " + getBrand() + " заканчивает движение");
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
    void getType() {
        System.out.println(Type.BUS);
    }

    @Override
    void printType() {
        if (getCapacity() == null) {
            System.out.println(getBrand() + ": " + "Данных по транспортному средству недостаточно.");
        } else {
            System.out.println(getBrand() + ": " + getCapacity());
        }
    }

    @Override
    void passDiagnostics() {
        try {
            throw new TransportTypeException();
        } catch (TransportTypeException e) {
            System.out.println("Автобусы не должны проходить диагностику.");
        }
    }

    @Override
    public String toString() {
        return "Bus: " + super.toString() + ", " + capacity;
    }
}
