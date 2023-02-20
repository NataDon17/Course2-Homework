package transport;

public abstract class Transport implements Competing {
    private final String brand;
    private final String model;
    private final double engineVolume;

    public Transport(String brand,
                     String model,
                     double engineVolume) {
        this.brand = (brand == null || brand.isEmpty() ? "default" : brand);
        this.model = (model == null || model.isEmpty() ? "default" : model);
        this.engineVolume = (engineVolume <= 0 ? 1.5 : engineVolume);
    }

    abstract void startMoving();

    abstract void endMoving();

    abstract void getType();

    abstract void printType();

    abstract void passDiagnostics () throws TransportTypeException;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    @Override
    public String toString() {
        return "марка: " + brand +
                ", модель: " + model +
                ", объем двигателя: " + engineVolume
                ;
    }
}
