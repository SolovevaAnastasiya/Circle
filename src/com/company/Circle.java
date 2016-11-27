package com.company;

public class Circle {
    double x;
    double y;
    double r;

    public Circle (double r) {
        if (r<=0){
            throw new RuntimeException("Радиус должен быть положительным");
        }
        this.r = r;
    }

    public void move(double dx, double dy){
        this.x+=dx;
        this.y+=dy;
    }

    public double circleLength(){
        double length = 2*Math.PI*this.r;
        return length;
        }


}
