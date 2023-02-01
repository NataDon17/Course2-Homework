package transport;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta=new Car(
                "",
                "Granta",
                -1,
                "Желтый",
                0,
                "Россия",
                null,
                null,
                null,
                0,
                true);
        Car audiA8=new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                "Черный",
                2020,
                "Германия",
                null,
                null,
                null,
                1,
                true);
        Car bmwZ8=new Car(
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
                true);
        Car kiaSportage4=new Car(
                "Kia",
                "Sportage 4-го поколения",
                2.4,
                "Красный",
                2018,
                "Южная Корея",
                null,
                null,
                null,
                25,
                false);
        Car hyundaiAvante=new Car(
                "Hyundai",
                "Avante",
                1.6,
                "",
                2016,
                null,
                null,
                null,
                null,
                4,
                false);
        System.out.println(ladaGranta.toString()+'\n'+audiA8+'\n'+bmwZ8+'\n'+kiaSportage4+'\n'+hyundaiAvante);
        ladaGranta.changeSeasonTyre(6);
        System.out.println(ladaGranta);
    }
}
