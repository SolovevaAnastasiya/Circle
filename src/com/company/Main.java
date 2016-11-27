package com.company;

public class Main {
    public static void main(String[] args) {
        Circle c=new Circle(10);
        System.out.println("Circle:" + c.x + "," + c.y+","+c.r);
        c.move(1,3);
        System.out.println("Circle:" + c.x + "," + c.y+","+c.r);
        double length=c.circleLength();
        System.out.println("Длина окружности равна:"+ length);
    }
}
