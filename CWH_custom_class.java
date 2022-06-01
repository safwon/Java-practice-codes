package com.company;

import java.security.PublicKey;

class Employee{
    int id;
    int salary;
    String name;


    public void printDetails(){
        System.out.println("My id is: "+id);
        System.out.println("And my name is: "+name);
    }

    public int getsalary(){
        return salary;
    }
}


public class CWH_custom_class {
    public static void main(String[] args) {

        Employee sadif = new Employee();// a new Employee obj
        Employee harry = new Employee();


        //Setting Attributes;
        sadif.id=103;
        sadif.name="Safwon Sadif Rahman";
        sadif.salary=1500;

        harry.id= 8;
        harry.name="Codewithharry";
        harry.salary=2000;


        sadif.printDetails();
        System.out.println(sadif.getsalary());

        harry.printDetails();
        System.out.println(harry.getsalary());



        /*System.out.println(sadif.id);
        System.out.println(sadif.name);*/

    }
}
