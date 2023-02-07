package transport;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car(
                "",
                "Granta",
                -1,
                "Желтый",
                0,
                "Россия",
                "черный",
                180,
                "механическая",
                "Седан",
                null,
                5,
                true,
                null);
        Car audiA8 = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                "Черный",
                2020,
                "Германия",
                "",
                300,
                "АКП",
                "Седан",
                "а888аа 038",
                4,
                true,
                new Car.Key(true, true));
        Car bmwZ8 = new Car(
                "BMW",
                "Z8",
                3,
                "Черный",
                2021,
                "Германия",
                null,
                350,
                null,
                null,
                null,
                5,
                true,
                new Car.Key(true, true));
        Car kiaSportage4 = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2.4,
                "Красный",
                2018,
                "Южная Корея",
                "",
                -5,
                "АКП",
                "Кроссовер",
                null,
                3,
                false,
                new Car.Key(true, false));
        Car hyundaiAvante = new Car(
                "Hyundai",
                "Avante",
                1.6,
                "",
                2016,
                null,
                null,
                220,
                null,
                "Седан",
                "м222мм 777",
                4,
                false,
                new Car.Key(false, true));

        System.out.println(ladaGranta.toString() + '\n' + audiA8 + '\n' + bmwZ8 + '\n' + kiaSportage4 + '\n' + hyundaiAvante);
        System.out.println();

        ladaGranta.changeSeasonTyre(8);
        System.out.println(ladaGranta);
        System.out.println();

        Bus bus1 = new Bus("Ikarus", "Ikarus 180", 1970, "Венгрия", "Белый", 63);
        Bus bus2 = new Bus("ЛиАЗ", "ЛиАЗ-677", 1985, "Россия", "Желтый", 70);
        Bus bus3 = new Bus("Yutong", "Yutong ZK6118HA", 2000, "Китай", "Серый", 120);
        System.out.println(bus1.toString() + '\n' + bus2 + '\n' + bus3);
        System.out.println("Созданное кол-во автобусов: " + Bus.counter);
    }
}
