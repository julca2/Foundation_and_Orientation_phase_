package com.greenfoxacademy.Flyable;

public abstract class Vehicle {
    String type;
    String color;

    int km;

    public Vehicle(String type, String color, int km) {
        this.type = type;
        this.color = color;
        this.km = km;
    }

    public Vehicle() {
    }
}
