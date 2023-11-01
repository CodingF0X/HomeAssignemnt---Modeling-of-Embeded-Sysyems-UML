import java.util.Date;

public class RentalContract {
     private MotorVehicle motorVehicle;
    private Date period;

    public RentalContract(MotorVehicle motorVehicle, Date period) {
        this.motorVehicle = motorVehicle;
        this.period = period;
    }

    public MotorVehicle getMotorVehicle() {
        return motorVehicle;
    }

    public double calculateBill() {
        return 100.0; 
    }
}
