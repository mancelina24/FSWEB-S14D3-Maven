package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;// Aynı nesne mi? O zaman true
        if (o == null || getClass() != o.getClass()) return false; // Null veya farklı sınıfsa false

        Car car = (Car) o;// Tür dönüşümü yapıyoruz

        if (cylinders != car.cylinders) return false;// Silindir sayısı farklıysa false
        return name.equals(car.name); // İsim aynıysa true
    }


    @Override
    public int hashCode() {
        return Objects.hash(cylinders, name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }
    public String startEngine() {
        return getClass().getSimpleName() + ": the car's engine is starting";
    }

    public String accelerate() {
        return getClass().getSimpleName() + ": the car is accelerating";
    }

    public String brake() {
        return getClass().getSimpleName() + ": the car is braking";
    }
}
