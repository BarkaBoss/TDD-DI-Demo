package org.example.dependency;

public class RAM {

    int capacity;
    String type;

    public RAM(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "capacity=" + capacity +
                ", type='" + type + '\'' +
                '}';
    }
}
