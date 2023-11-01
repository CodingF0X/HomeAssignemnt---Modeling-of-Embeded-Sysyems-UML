public abstract class MotorVehicle {
    private String category;
    private boolean availability;

    public MotorVehicle(String category) {
        this.category = category;
        this.availability = true;
    }

    public String getCategory() {
        return category;
    }

    public boolean isAvailable() {
        return availability;
    }
}