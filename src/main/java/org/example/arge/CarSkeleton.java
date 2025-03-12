package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine() {
        return getClass().getSimpleName() + ": Generic car engine starting.";
    }

    public String drive() {
        runEngine();
        return getClass().getSimpleName() + ": Generic car driving.";
    }

    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + ": Running engine - generic implementation.");
    }

    @Override
    public String toString() {
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
