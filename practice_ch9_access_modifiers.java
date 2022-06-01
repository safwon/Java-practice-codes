package com.company;
import java.lang.Math;


// Class Cylinder
/*class Cylinder{

    private float radius;
    private float height;*/


//Constractor
 /*   public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }*/
//surface area and volume by getter and setter
  /*  public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }



    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public double surfaceArea(){
        return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }

}*/

class Rectangle{
    private int length;
    private  int breadth;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }


}




public class practice_ch9_access_modifiers {
    public static void main(String[] args) {


//surface area and volume
        /*Cylinder c= new Cylinder();
        c.setHeight(12);
        c.setRadius(9);*/

//Constractor

       /* Cylinder c= new Cylinder(9,12);


        System.out.println(c.getHeight());
        System.out.println(c.getRadius());
        System.out.printf("%.2f\n",c.surfaceArea());
        System.out.printf("%.2f",c.volume());
*/

        Rectangle r= new Rectangle(4,5);

        System.out.println(r.getBreadth());
        System.out.println(r.getLength());




    }
}
