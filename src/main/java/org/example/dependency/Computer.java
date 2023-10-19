package org.example.dependency;

public class Computer {

    int screenSize;
    CPU myCPU;
    RAM myRam;

    public Computer(int screenSize, CPU myCPU, RAM myRam) {
        this.screenSize = screenSize;
        this.myCPU = myCPU;
        this.myRam = myRam;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "screenSize=" + screenSize +
                ", myCPU=" + myCPU +
                ", myRam=" + myRam +
                '}';
    }
}
