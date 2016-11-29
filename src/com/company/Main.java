package com.company;

public class Main {
    public static void main(String[] args) {
        Circle c=new Circle(10);
        System.out.println("Circle:" + c.x + "," + c.y+","+c.r);
        c.move(1,3);
        System.out.println("Circle:" + c.x + "," + c.y+","+c.r);
        double length=c.circleLength();
        System.out.println("Длина окружности равна:"+ length);
        Circle c1=new Circle(2,3,5);
        System.out.println("Circle1:" + c1.x + "," + c1.y+","+c1.r);
        c1.moveTo(3,12);
        System.out.println("Circle1:" + c1.x + "," + c1.y+","+c1.r);
        double d= c1.diametr();
        System.out.println("Диаметр1:"+ d);
        double s= c1.circleSquare();
        System.out.println("Площадь круга1:"+ s);
       boolean in= c1.insidePoint(1,2);
        System.out.println(in);
    }
}
