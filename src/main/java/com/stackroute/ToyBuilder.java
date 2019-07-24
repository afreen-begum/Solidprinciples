package com.stackroute;

public class ToyBuilder {
    public static void main(String[] args) {
        Train t1 = new Train();
        t1.Train();
        t1.move();
        Plane t2 = new Plane();
        t2.Plane();
        t2.fly();
        t2.move();
        Doll t3 = new Doll();
        t3.Doll();
    }
}