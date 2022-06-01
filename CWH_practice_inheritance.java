package com.company;

class Circle{
    public int radius;

    Circle(int r){
        this.radius = r;
        System.out.println("I am the circle");
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder extends Circle{
    public int height;

    Cylinder(int r, int h) {
        super(r);
        System.out.println("I am the cylinder");
        this.height = h;
    }


    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}


public class CWH_practice_inheritance {
    public static void main(String[] args) {

//        Circle objC = new Circle(12);
        Cylinder objCy = new Cylinder(12,13);

    }
}
