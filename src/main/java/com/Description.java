package com;

public class Description {
    private String name;
    private double hoursePower;
    private double torque;

    public Description(String name, double hoursePower, double maxSpeed) {
        this.name = name;
        this.hoursePower = hoursePower;
        this.torque = maxSpeed;
    }

    public Description() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursePower() {
        return hoursePower;
    }

    public void setHoursePower(double hoursePower) {
        this.hoursePower = hoursePower;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    @Override
    public String toString() {
        return "Description{" +
                "name='" + name + '\'' +
                ", hoursePower=" + hoursePower +
                ", torque=" + torque +
                '}';
    }
}
