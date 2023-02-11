package transport;


public class Car extends Transport {
    double engineVolume;
    private String color;
    private String transmission;
    private final String bodyType;
    private String serialNumber;
    private final int numberOfSeats;
    private boolean typeTyre;
    private Key key;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String bodyColor,
               double maxSpeed,
               String transmission,
               String bodyType,
               String serialNumber,
               int numberOfSeats,
               boolean typeTyre,
               Key key) {
        super(brand, model, productionYear, productionCountry, bodyColor, maxSpeed);
        this.engineVolume = (engineVolume <= 0 ? 1.5 : engineVolume);
        this.color = (color == null || color.isEmpty() ? "белый" : color);
        this.transmission = (transmission == null || transmission.isEmpty() ? "не определено" : transmission);
        this.bodyType = (bodyType == null || bodyType.isEmpty() ? "Седан" : bodyType);
        this.serialNumber = (serialNumber == null || serialNumber.isEmpty() ? "x???xx ???" : serialNumber);
        this.numberOfSeats = (numberOfSeats <= 0 || numberOfSeats > 20 ? 2 : numberOfSeats);
        this.typeTyre = typeTyre;
        this.key = (key == null ? new Key(false, false) : key);
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "удаленный запуск двигателя: " + (remoteEngineStart ? "имеется" : "отсутствует") +
                    ", бесключевой доступ: " + (keylessAccess ? "имеется" : "отсутствует");
        }
    }

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

    public String getBodyType() {
        return bodyType;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isTypeTyre() {
        return typeTyre;
    }

    public void setTypeTyre(boolean typeTyre) {
        this.typeTyre = typeTyre;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
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
        return "Car: " + super.toString() +
                ", объем двигателя: " + engineVolume +
                ", цвет: " + color +
                ", коробка передач: " + transmission +
                ", тип кузова: " + bodyType +
                ", рег. номер: " + serialNumber +
                ", количество мест: " + numberOfSeats +
                ", сезон резины: " + (typeTyre ? "зимняя" : "летняя") +
                ", " + key;
    }
}