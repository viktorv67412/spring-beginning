package com.model;

public class Auto {

    private String name;
    private double maxPower;
    private double torque;
    private double maxSpeed;

    public Auto(String name, double maxPower, double torque, double maxSpeed) {
        this.name = name;
        this.maxPower = maxPower;
        this.torque = torque;
        this.maxSpeed = maxSpeed;
    }

    public Auto() {
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public double maxPower() {
        return maxPower;
    }

    public void maxPower(double maxPower) {
        this.maxPower = maxPower;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
