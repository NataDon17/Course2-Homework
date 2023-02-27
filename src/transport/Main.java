package transport;

import java.util.*;

public class Main {
    public static void main(String[] args) throws TransportTypeException, CloneNotSupportedException {
        Mechanic mechanic1 = new Mechanic("Валера Колесов", "ООО Колесо");
        Mechanic mechanic2 = new Mechanic("Толя Бамперов", "ООО Бампер");
        Mechanic mechanic3 = new Mechanic("Миша Двигателев", "ЗАО Двигатель");
        Mechanic mechanic4 = new Mechanic("Саша Торомозов", "ЗАО Тормоз");
        Mechanic mechanic5 = new Mechanic("Женя Стеклов", "ООО Кристалл");
        List<Mechanic> mechanicsCar = new ArrayList<>(3);
        mechanicsCar.add(mechanic1);
        mechanicsCar.add(mechanic3);
        mechanicsCar.add(mechanic5);
        Car audi = new Car("Audi", "A8", 3, Car.BodyType.SEDAN, mechanicsCar);
        Car bmw = new Car("BMW", "Z8", 3, Car.BodyType.SUV, mechanicsCar);
        Car kia = new Car("Kia", "Sportage", 2.4, Car.BodyType.MINIVAN, mechanicsCar);
        Car lada = new Car("Lada", "Granta", 1.8, null, mechanicsCar);
        System.out.println(audi.toString() + '\n' + bmw + '\n' + kia + '\n' + lada);

        List<Mechanic> mechanicsBus = new ArrayList<>(3);
        mechanicsBus.add(mechanic1);
        mechanicsBus.add(mechanic2);
        mechanicsBus.add(mechanic4);
        Bus bus1 = new Bus("Ikarus", "Ikarus 180", 2, Bus.Capacity.EXTRA_LARGE, mechanicsBus);
        Bus bus2 = new Bus("ЛиАЗ", "ЛиАЗ-677", 0, null, mechanicsBus);
        Bus bus3 = new Bus("Yutong", "Yutong ZK6118HA", 0, Bus.Capacity.LARGE, mechanicsBus);
        Bus bus4 = new Bus("ПАЗ", "ПАЗ-3205", 0, Bus.Capacity.EXTRA_SMALL, mechanicsBus);
        System.out.println(bus1.toString() + '\n' + bus2 + '\n' + bus3 + '\n' + bus4);

        List<Mechanic> mechanicsTruck = new ArrayList<>(2);
        mechanicsTruck.add(mechanic2);
        mechanicsTruck.add(mechanic5);
        Truck truck1 = new Truck("Tatra", "30-Sport", 13, Truck.LiftingCapacity.N3, mechanicsTruck);
        Truck truck2 = new Truck("Scania", "S580", 15, Truck.LiftingCapacity.N2, mechanicsTruck);
        Truck truck3 = new Truck("KAMAZ", "65225", 13, Truck.LiftingCapacity.N1, mechanicsTruck);
        Truck truck4 = new Truck("Volvo", "Wild Viking", 13, null, mechanicsTruck);
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
        try {
            bus4.passDiagnostics();
        } catch (TransportTypeException e) {
            System.out.println("Автобусы не должны проходить диагностику.");
        }
        truck4.passDiagnostics();
        System.out.println();

        List<Transport> transportList = new ArrayList<>(12);
        transportList.add(audi);
        transportList.add(bmw);
        transportList.add(kia);
        transportList.add(lada);
        transportList.add(bus1);
        transportList.add(bus2);
        transportList.add(bus3);
        transportList.add(bus4);
        transportList.add(truck1);
        transportList.add(truck2);
        transportList.add(truck3);
        transportList.add(truck4);
        System.out.println(transportList);

        mechanic2.performMaintenance(truck2);
        mechanic4.mendMachine(bus3);

        bus1.nameDriver(driver2);
        truck1.nameMechanic(mechanicsTruck);

        ServiceStation transportQueue = new ServiceStation();
        Transport.checkTypeForMaintenance(audi);
        Transport.checkTypeForMaintenance(bmw);
        Transport.checkTypeForMaintenance(truck1);
        Transport.checkTypeForMaintenance(bus1);
        Transport.checkTypeForMaintenance(truck2);
        transportQueue.carryMaintenance();

        Car audiClone = (Car) audi.clone();
        Car kiaClone = (Car) kia.clone();
        Map<String, List> carListMap = new HashMap<>();
        carListMap.put(audi.getBrand(), mechanicsCar);
        carListMap.put(bmw.getBrand(), mechanicsCar);
        carListMap.put(audiClone.getBrand(), mechanicsCar);
        carListMap.put(kia.getBrand(), mechanicsCar);
        carListMap.put(kiaClone.getBrand(), mechanicsCar);

        for (Map.Entry<String, List> car : carListMap.entrySet()) {
            System.out.println("Автомобиль: " + car.getKey() + ", " + "его механики: " + car.getValue());
        }
    }
}
