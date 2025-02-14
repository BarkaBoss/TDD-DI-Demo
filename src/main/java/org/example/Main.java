package org.example;

import org.example.dependency.CPU;
import org.example.dependency.Computer;
import org.example.dependency.RAM;

public class Main {


    public static void main(String[] args) {

        Computer hp250 = new Computer(15,
                new CPU("coreI5", 1.5f),
                new RAM(4, "DDR4")
        );

        System.out.println(hp250);
        //Fib fib = new Fib(10);

//        for (int i = 0; i < 25; i++) {
//            for (int j = 0; j < 25; j++) {
//                System.out.println(i);
//            }
//        }

    }
}