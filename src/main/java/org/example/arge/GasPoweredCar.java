package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLiter, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLiter;
    }



    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ": Gas engine starting. Cylinders: " + cylinders;
    }

    @Override
    public String drive() {
        runEngine();
        return getClass().getSimpleName() + ": Driving on gas - " + avgKmPerLiter + " km per litre.";
    }

    @Override
    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + ": Gas engine running smoothly.");
    }

    @Override
    public String toString() {
        return "GasPoweredCar{" +
                "avgKmPerLiter=" + avgKmPerLiter +
                ", cylinders=" + cylinders +
                '}';
    }
}
