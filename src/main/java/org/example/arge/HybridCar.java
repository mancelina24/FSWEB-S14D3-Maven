package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLiter, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public void setAvgKmPerLiter(double avgKmPerLiter) {
        this.avgKmPerLiter = avgKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ": Hybrid engine starting - combining gas and electric.";
    }

    @Override
    public String drive() {
        runEngine();
        return getClass().getSimpleName() + ": Driving hybrid - " + avgKmPerLiter + " km per litre, battery size: " + batterySize + ", cylinders: " + cylinders + ".";
    }

    @Override
    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + ": Hybrid engine switching between modes.");
    }

    @Override
    public String toString() {
        return "HybridCar{" +
                "avgKmPerLiter=" + avgKmPerLiter +
                ", batterySize=" + batterySize +
                ", cylinders=" + cylinders +
                '}';
    }
}
