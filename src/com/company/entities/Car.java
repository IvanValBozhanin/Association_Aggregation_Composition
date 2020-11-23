package com.company.entities;

public class Car {
    private final Person owner;
    private final Company brand;
    private final double power;


    public Car(Person owner, Company brand, double power) {
        this.owner = owner;
        this.brand = brand;
        this.power = power;
    }

    public Person getOwner() {
        return owner;
    }

    public Company getBrand() {
        return brand;
    }

    public double getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "owner=" + owner +
                ", brand=" + brand.getName() +
                ", power=" + power +
                '}';
    }
}
