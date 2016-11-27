package com;

public class Lorry implements Auto {
    private Description description;

    public Lorry(Description description) {
        this.description = description;
    }

    public Lorry() {
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public String toString() {
        return "Lorry{" +
                "description=" + description +
                '}';
    }
}
