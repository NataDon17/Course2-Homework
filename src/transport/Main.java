package transport;

public class Main {
    public static void main(String[] args) throws TransportTypeException {
        Car audi = new Car("Audi", "A8", 3, Car.BodyType.SEDAN);
        Car bmw = new Car("BMW", "Z8", 3, Car.BodyType.SUV);
        Car kia = new Car("Kia", "Sportage", 2.4, Car.BodyType.MINIVAN);
        Car lada = new Car("Lada", "Granta", 1.8, null);
        System.out.println(audi.toString() + '\n' + bmw + '\n' + kia + '\n' + lada);

        Bus bus1 = new Bus("Ikarus", "Ikarus 180", 2, Bus.Capacity.EXTRA_LARGE);
        Bus bus2 = new Bus("ЛиАЗ", "ЛиАЗ-677", 0, null);
        Bus bus3 = new Bus("Yutong", "Yutong ZK6118HA", 0, Bus.Capacity.LARGE);
        Bus bus4 = new Bus("ПАЗ", "ПАЗ-3205", 0, Bus.Capacity.EXTRA_SMALL);
        System.out.println(bus1.toString() + '\n' + bus2 + '\n' + bus3 + '\n' + bus4);

        Truck truck1 = new Truck("Tatra", "30-Sport", 13, Truck.LiftingCapacity.N3);
        Truck truck2 = new Truck("Scania", "S580", 15, Truck.LiftingCapacity.N2);
        Truck truck3 = new Truck("KAMAZ", "65225", 13, Truck.LiftingCapacity.N1);
        Truck truck4 = new Truck("Volvo", "Wild Viking", 13, null);
        System.out.println(truck1.toString() + '\n' + truck2 + '\n' + truck3 + '\n' + truck4);

        DriverCategoryB<Car> driver1 = new DriverCategoryB<>(
                "Сидоров Иван Петрович",
                true,
                5);
        System.out.println(driver1.getCarMessage(kia));

        DriverCategoryC<Bus> driver2 = new DriverCategoryC<>(
                "Петров Сидор Иванович",
                true,
                10);
        System.out.println(driver2.getCarMessage(bus2));

        DriverCategoryD<Truck> driver3 = new DriverCategoryD<>(
                "Иванов Петр Сидорович",
                true,
                12);
        System.out.println(driver3.getCarMessage(truck4));

        bmw.getType();
        audi.printType();
        lada.printType();

        bus3.getType();
        bus1.printType();
        bus2.printType();

        truck1.getType();
        truck2.printType();
        truck3.printType();
        System.out.println();

        kia.passDiagnostics();
        bus4.passDiagnostics();
        truck4.passDiagnostics();

    }
}
