package transport;

import java.util.List;

public class Truck extends Transport implements Competing {

    enum LiftingCapacity {
        N1(3.5F, null),
        N2(12F, 3.5F),
        N3(null, 12F);

        private Float upperLimit;
        private Float lowerLimit;

        LiftingCapacity(Float upperLimit, Float lowerLimit) {
            this.upperLimit = upperLimit;
            this.lowerLimit = lowerLimit;
        }

        public Float getUpperLimit() {
            return upperLimit;
        }

        public void setUpperLimit(Float upperLimit) {
            this.upperLimit = upperLimit;
        }

        public Float getLowerLimit() {
            return lowerLimit;
        }

        public void setLowerLimit(Float lowerLimit) {
            this.lowerLimit = lowerLimit;
        }

        @Override
        public String toString() {
            if (lowerLimit == null)
                return "Грузоподъемность: до " + getUpperLimit() + " тонн";
            else if (upperLimit == null)
                return "Грузоподъемность: от " + getLowerLimit() + " тонн";
            else
                return "Грузоподъемность: от " + getLowerLimit() + " тонн до " + getUpperLimit() + " тонн";
        }
    }

    private LiftingCapacity liftingCapacity;

    public Truck(String brand,
                 String model,
                 double engineVolume,
                 LiftingCapacity liftingCapacity,
                 List<Mechanic> mechanics) {
        super(brand, model, engineVolume, mechanics);
        this.liftingCapacity = liftingCapacity;
    }

    public LiftingCapacity getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(LiftingCapacity liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    void startMoving() {
        System.out.println("Грузовик " + getBrand() + " начинает движение");
    }

    @Override
    void endMoving() {
        System.out.println("Грузовик " + getBrand() + " заканчивает движение");
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
    void getType() {
        System.out.println(Type.TRUCK);
    }

    @Override
    void printType() {
        if (getLiftingCapacity() == null) {
            System.out.println(getBrand() + ": " + "Данных по транспортному средству недостаточно.");
        } else {
            System.out.println(getBrand() + ": " + getLiftingCapacity());
        }
    }

    @Override
    void passDiagnostics() {
        System.out.println(getBrand()+": Грузовой автомобиль должен пройти диагностику");
    }

    @Override
    public String toString() {
        return "Truck: " + super.toString() + ", " + liftingCapacity;
    }
}
