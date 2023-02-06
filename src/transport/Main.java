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
                "Седан",
                "м222мм 777",
                4,
                false,
                new Car.Key(false, true));

        System.out.println(ladaGranta.toString() + '\n' + audiA8 + '\n' + bmwZ8 + '\n' + kiaSportage4 + '\n' + hyundaiAvante);
        System.out.println();

        ladaGranta.changeSeasonTyre(8);
        System.out.println(ladaGranta);
    }
}
