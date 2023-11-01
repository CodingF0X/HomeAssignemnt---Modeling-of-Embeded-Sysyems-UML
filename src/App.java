import java.util.Date;

public class App {
    public static void main(String[] args) {
        RentalOffice rentalOffice = new RentalOffice();

        Car car = new Car("Sedan");
        Van van = new Van("Minivan");
        Truck truck = new Truck("Pickup");

        Client client = new Client("John Doe", "ABC123");

        ReservationContract reservationContract = new ReservationContract("Sedan", new Date());

        rentalOffice.reserveMotorVehicle(client, reservationContract);
        RentalContract rentalContract = new RentalContract(car, new Date());
        rentalOffice.rentMotorVehicle(client, rentalContract);

        InsuranceContract insuranceContract = new InsuranceContract(rentalContract);

        client.signInsuranceContract(insuranceContract);
        rentalOffice.generateBill(client, rentalContract);
    }
}