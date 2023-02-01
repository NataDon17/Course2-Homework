package OOP;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta=new Car ();
        ladaGranta.brand="Lada";
        ladaGranta.model="Granta";
        ladaGranta.engineVolume=1.7;
        ladaGranta.color="Желтый";
        ladaGranta.productionYear=2015;
        ladaGranta.productionCountry="Россия";

        Car audiA8=new Car();
        audiA8.brand="Audi";
        audiA8.model="A8 50 L TDI quattro";
        audiA8.engineVolume=3.0;
        audiA8.color="Черный";
        audiA8.productionYear=2020;
        audiA8.productionCountry="Германия";

        Car bmwZ8=new Car();
        bmwZ8.brand="BMW";
        bmwZ8.model="Z8";
        bmwZ8.engineVolume=3;
        bmwZ8.color="Черный";
        bmwZ8.productionYear= 2021;
        bmwZ8.productionCountry="Германия";

        Car kiaSportage4=new Car();
        kiaSportage4.brand="Kia";
        kiaSportage4.model="Sportage 4-го поколения";
        kiaSportage4.engineVolume=2.4;
        kiaSportage4.color="Красный";
        kiaSportage4.productionYear=2018;
        kiaSportage4.productionCountry="Южная Корея";

        Car hyundaiAvante=new Car();
        hyundaiAvante.brand="Hyundai";
        hyundaiAvante.model="Avante";
        hyundaiAvante.engineVolume=1.6;
        hyundaiAvante.color="Оранжевый";
        hyundaiAvante.productionYear=2016;
        hyundaiAvante.productionCountry="Южная Корея";

        System.out.println(ladaGranta.toString()+'\n'+audiA8+'\n'+bmwZ8+'\n'+kiaSportage4+'\n'+hyundaiAvante);
        System.out.println();


        Car ladaGranta1=new Car("","Granta", -1, "Желтый", 0, "Россия" );
        Car audiA81=new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия" );
        Car bmwZ81=new Car("BMW", "Z8", 3, "Черный", 2021, "Германия" );
        Car kiaSportage41=new Car("Kia", "Sportage 4-го поколения", 2.4, "Красный", 2018, "Южная Корея" );
        Car hyundaiAvante1=new Car("Hyundai", "Avante", 1.6, "", 2016, null );
        System.out.println(ladaGranta1.toString()+'\n'+audiA81+'\n'+bmwZ81+'\n'+kiaSportage41+'\n'+hyundaiAvante1);
    }
}
