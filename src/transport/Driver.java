package transport;

abstract class Driver {
    private String fullName;
    private boolean validDriversLicense;
    private double experienceDriving;

    public Driver(String fullName, boolean validDriversLicense, double experienceDriving) {
        this.fullName = fullName;
        this.validDriversLicense = validDriversLicense;
        this.experienceDriving = experienceDriving;
    }

    abstract void startMoving();

    abstract void endMoving();

    abstract void refuelTransport();

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isValidDriversLicense() {
        return validDriversLicense;
    }

    public void setValidDriversLicense(boolean validDriversLicense) {
        this.validDriversLicense = validDriversLicense;
    }

    public double getExperienceDriving() {
        return experienceDriving;
    }

    public void setExperienceDriving(double experienceDriving) {
        this.experienceDriving = experienceDriving;
    }

    @Override
    public String toString() {
        return "Водитель: " +
                "ФИО: " + fullName + '\'' +
                ", наличие водительских прав: " + (validDriversLicense?"имеются":"отсутсвуют") +
                ", стаж вождения: " + experienceDriving+" лет.";
    }
}
