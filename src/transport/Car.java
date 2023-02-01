package transport;


public class Car {
    private final String brand;
    private final String model;
    double engineVolume;
    String color;
    private final int productionYear;
    private final String productionCountry;
    String transmission;
    private final String bodyType;
    String serialNumber;
    private final int numberOfSeats;
    boolean typeTyre;
    String seasonTyre;


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String transmission,
               String bodyType,
               String serialNumber,
               int numberOfSeats,
               boolean typeTyre) {
        this.brand = (brand == null || brand.isEmpty() ? "default" : brand);
        this.model = (model == null || model.isEmpty() ? "default" : model);
        this.engineVolume = (engineVolume <= 0 ? 1.5 : engineVolume);
        this.color = (color == null || color.isEmpty() ? "Белый" : color);
        this.productionYear = (productionYear <= 0 ? 2000 : productionYear);
        this.productionCountry = (productionCountry == null || productionCountry.isEmpty() ? "default" : productionCountry);
        this.transmission = (transmission == null || transmission.isEmpty() ? "default" : transmission);
        this.bodyType = (bodyType == null || bodyType.isEmpty() ? "default" : bodyType);
        this.serialNumber = (serialNumber == null || serialNumber.isEmpty() ? "default" : serialNumber);
        this.numberOfSeats = (numberOfSeats <= 0 || numberOfSeats > 20 ? 2 : numberOfSeats);
        seasonTyre = (typeTyre ? "зимняя" : "летняя");


    }

    public void changeSeasonTyre(int monthNumber) {
        switch (monthNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 11:
            case 12:
                typeTyre = true;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                typeTyre = false;
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }


    @Override
    public String toString() {
        return "Car " +
                "марка: " + brand +
                ", модель:" + model +
                ", объем двигателя: " + engineVolume +
                ", цвет: " + color +
                ", год выпуска: " + productionYear +
                ", страна-производител: " + productionCountry +
                ", коробка передач: " + transmission +
                ", тип кузова: " + bodyType +
                ", рег. номер: " + serialNumber +
                ", количество мест: " + numberOfSeats +
                ", сезон резины: " + seasonTyre;
    }
}