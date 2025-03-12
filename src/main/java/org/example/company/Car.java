package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders,String name) {
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
    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String accelerate() {

        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";
    }

    public String brake() {
        System.out.println(getClass().getSimpleName());
        return "the car is braking";
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

}
