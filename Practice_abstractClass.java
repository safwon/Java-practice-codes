package com.company;


//fountain pen
/*abstract class pen{
    abstract void write();
    abstract void refill();
}

class fountainpen extends pen{

    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");

    }
    void changeNid(){
        System.out.println("nib changed");
    }
}*/
// Monkey
/*class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting!");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
    }


class Human extends Monkey implements BasicAnimal{

    void speak(){
        System.out.println("Hello sir");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }
}*/

public class Practice_abstractClass {
    public static void main(String[] args) {
        //fountain pen
    /* fountainpen pen = new fountainpen();
     pen.changeNid();*/
        //human
      /*  Human obj = new Human();
        obj.jump();
        obj.bite();
        obj.eat();
        obj.sleep();
        obj.speak();*/
        //polymorphism
        /*Monkey m1 = new Human();
        m1.jump();*/


    }
}
