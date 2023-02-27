package transport;

import java.util.List;

import static transport.ServiceStation.addMachineToQueue;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private List<Mechanic> mechanics;

    public Transport(String brand,
                     String model,
                     double engineVolume,
                     List<Mechanic> mechanics) {
        this.brand = (brand == null || brand.isEmpty() ? "default" : brand);
        this.model = (model == null || model.isEmpty() ? "default" : model);
        this.engineVolume = (engineVolume <= 0 ? 1.5 : engineVolume);
        this.mechanics = mechanics;
    }

    abstract void startMoving();

    abstract void endMoving();

    abstract void getType();

    abstract void printType();

    public void nameDriver(T driver) {
        System.out.println("Водителя т/с " + getBrand() + " зовут " + driver.getFullName());
    }

    public void nameMechanic(List<Mechanic> mechanics) {
        System.out.println("У т/с " + getBrand() + " есть следующие механики: " + mechanics);
    }

    public static void checkTypeForMaintenance(Transport transport) {
        if (transport instanceof Car || transport instanceof Truck) {
            addMachineToQueue(transport);
        } else if (transport instanceof Bus) {
            System.out.println("Автобусы не нуждаются в техобслуживании перед заездом.");
        }
    }

    abstract void passDiagnostics() throws TransportTypeException;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setMechanics(List<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }


    @Override
    public String toString() {
        return "марка: " + brand +
                ", модель: " + model +
                ", объем двигателя: " + engineVolume +
                ", механики: " + mechanics
                ;
    }
}
