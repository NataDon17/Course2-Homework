package transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String bodyColor;
    private double maxSpeed;

    public Transport(String brand,
                     String model,
                     int productionYear,
                     String productionCountry,
                     String bodyColor,
                     double maxSpeed) {
        this.brand = (brand == null || brand.isEmpty() ? "default" : brand);
        this.model = (model == null || model.isEmpty() ? "default" : model);
        this.productionYear = (productionYear <= 0 ? 2000 : productionYear);
        this.productionCountry = (productionCountry == null || productionCountry.isEmpty() ? "default" : productionCountry);
        this.bodyColor = (bodyColor == null || bodyColor.isEmpty() ? "белый" : bodyColor);
        this.maxSpeed = (maxSpeed < 0 || maxSpeed > 400 ? 150 : maxSpeed);
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

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "марка: " + brand +
                ", модель: " + model +
                ", год выпуска: " + productionYear +
                ", страна-производитель: " + productionCountry +
                ", цвет кузова: " + bodyColor +
                ", максимальная скорость передвижения: " + maxSpeed;
    }
}
