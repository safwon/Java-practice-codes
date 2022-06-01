package com.company;

class Base{
   /* public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }*/
    Base(){
        System.out.println("I am a constructor");
    }
    Base(int a){
        System.out.println("I am a overloaded constructor: "+a);
    }
}

class Derived extends Base{
   /* public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }*/
    Derived(){
        //super(0);
        System.out.println("I am a derived ");
    }
    Derived(int a, int b){
        super(a);
        System.out.println("Overloaded derived constructor of: "+b);
    }
}

class ChildOfDerived extends Derived{
    ChildOfDerived(){

        System.out.println("I am Child of derived");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am a overloaded ChildOfDerived: "+z);
    }

}




public class CWH_ch10_inheritance {
    public static void main(String[] args) {

        // Creating an Object of base class
        //Base b = new Base();
        //Derived d=new Derived(1,2);
        ChildOfDerived cd = new ChildOfDerived(1,2,3);


       /* b.setX(4);
        System.out.println(b.getX());

        // Creating an object of derived class
        Derived d = new Derived();
        d.setY(43);
        System.out.println(d.getY());*/

    }
}
