import java.util.Date;

public class ReservationContract {
    private String motorVehicleCategory;
    private Date period;

    public ReservationContract(String motorVehicleCategory, Date period) {
        this.motorVehicleCategory = motorVehicleCategory;
        this.period = period;
    }

    public String getMotorVehicleCategory() {
        return motorVehicleCategory;
    }
}