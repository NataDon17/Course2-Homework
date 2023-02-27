package transport;

public class Mechanic {
    private String fullName;
    private String company;

    public Mechanic(String fullName, String company) {
        this.fullName = fullName;
        this.company = company;
    }

    public void performMaintenance(Transport transport) {
        System.out.println("Механик " + getFullName() + " проводит техобслуживание " + transport.getBrand());
    }

    public void mendMachine(Transport transport) {
        System.out.println("Механик " + getFullName() + " чинит машину " + transport.getBrand());
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Механик: " +
                fullName +
                ", место работы: " + company;
    }

}
