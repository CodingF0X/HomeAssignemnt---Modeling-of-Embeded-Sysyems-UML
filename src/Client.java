public class Client {
    private String name;
    private String drivingLicense;

    public Client(String name, String drivingLicense) {
        this.name = name;
        this.drivingLicense = drivingLicense;
    }

    public String getName() {
        return name;
    }

    public void signInsuranceContract(InsuranceContract contract) {
        System.out.println("Signing insurance contract for client: " + name);
    }
}