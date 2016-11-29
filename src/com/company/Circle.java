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

    public Circle (double x, double y, double r){
        if (r<=0){
            throw new RuntimeException("Радиус должен быть положительным");
        }
        this.r = r;
        this.x = x;
        this.y =y;
    }


    public void move(double dx, double dy){
        this.x+=dx;
        this.y+=dy;
    }

    public double circleLength(){
        double length = 2*Math.PI*this.r;
        return length;
        }

    public void moveTo(double x, double y) {
        this.x=x;
        this.y=y;
    }

    public double diametr(){
        double d = 2*this.r;
        return d;
    }

    public double circleSquare(){
        double square = this.r*this.r*Math.PI;
        return square;
    }



}


