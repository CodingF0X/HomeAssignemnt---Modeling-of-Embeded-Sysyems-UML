import java.util.Date;

public class RentalOffice {
    public void reserveMotorVehicle(Client client, ReservationContract contract) {
        System.out.println("Reserving a motor vehicle for client: " + client.getName());
        System.out.println("Motor vehicle category: " + contract.getMotorVehicleCategory());
    }

    public void rentMotorVehicle(Client client, RentalContract contract) {
        System.out.println("Renting a motor vehicle to client: " + client.getName());
        System.out.println("Motor vehicle: " + contract.getMotorVehicle().getCategory());
    }

    public void generateBill(Client client, RentalContract contract) {
        System.out.println("Generating bill for client: " + client.getName());
        System.out.println("Bill amount: " + contract.calculateBill());
    }
}