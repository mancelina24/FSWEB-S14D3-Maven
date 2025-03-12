package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public void setAvgKmPerCharge(double avgKmPerCharge) {
        this.avgKmPerCharge = avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ": Electric engine starting... silence!";
    }

    @Override
    public String drive() {
        runEngine();
        return getClass().getSimpleName() + ": Driving electric - " + avgKmPerCharge + " km per charge, battery size: " + batterySize + ".";
    }

    @Override
    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + ": Electric engine humming quietly.");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "avgKmPerCharge=" + avgKmPerCharge +
                ", batterySize=" + batterySize +
                '}';
    }
}
