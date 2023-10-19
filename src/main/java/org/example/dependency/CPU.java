package org.example.dependency;

public class CPU {

    String type;
    float speed;

    public CPU(String type, float speed) {
        this.type = type;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "type='" + type + '\'' +
                ", speed=" + speed +
                '}';
    }
}
