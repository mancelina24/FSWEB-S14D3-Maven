package org.example.company;

public class Ford extends Car{
    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String brake() {
        return super.brake();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }
}
