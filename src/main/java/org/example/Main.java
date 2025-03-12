package org.example;
import org.example.company.*;
import org.example.arge.*;


public class Main {
    public static void main(String[] args) {

        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");

        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");

        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        System.out.println("----------------Car Skeleton Demo----------------");

        CarSkeleton carSkeleton = new CarSkeleton("Mitsubishi-ZX400","This car is very expensive");
        System.out.println(carSkeleton.startEngine());
        carSkeleton.drive();
        System.out.println(carSkeleton);

        CarSkeleton gasPoweredCar = new GasPoweredCar("Subaru-70S","Fast Car",4.2,4);
        System.out.println(gasPoweredCar.startEngine());
        gasPoweredCar.drive();
        System.out.println(gasPoweredCar);

        CarSkeleton hybridCar = new HybridCar("Toyota-40M","Hybrid Car",3.4,200000,4);
        System.out.println(hybridCar.startEngine());
        hybridCar.drive();
        System.out.println(hybridCar);

        ElectricCar electricCar = new ElectricCar("Tesla-S","Newest Model",405,250000);
        System.out.println(electricCar.startEngine());
        electricCar.drive();
        System.out.println(electricCar);

    }
}