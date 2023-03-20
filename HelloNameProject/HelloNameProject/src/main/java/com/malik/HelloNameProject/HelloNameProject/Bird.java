package com.malik.HelloNameProject.HelloNameProject;

public class Bird {
    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", canFly=" + canFly +
                '}';
    }

    public String name;
    public String color;
    public boolean canFly;
}

