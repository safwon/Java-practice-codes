package com.company;

public class CWH_chap7_methods {
    //methods
   /* static int logic(int x, int y){
        int z;
        if (x>y){
            z=x+y;
        }
        else {
            z=(x+y)*5;
        }
        return z;

    }*/
    // method overloading
  /*  static void telljoke(){
        System.out.println("Haha no jokes");
    }*/
   /* static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo(int a){
        System.out.println("Good morning "+ a +" bro!");
    }*/
    // vararg variable and arguments
   /* static int sum(int ...arr){
        int result = 0;
        for (int e: arr){
            result += e;
        }
        return result;

    }*/
    // recursion
   /* static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }*/
    public static void main(String[] args) {

     /*  When static void/int is not written on method then we need to create an obj
     to access that method


     CWH_chap7_methods obj = new CWH_chap7_methods();
     c = obj.logic(a, b);

      */

        //codes
       /* int a=2;
        int b= 5;
        int c;
        c = logic(a,b);


        int a1=2;
        int b1=1;
        int c1;
        c1=logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);*/

        // methods overloading
        /*telljoke();
         foo();
        foo(200);*/


        // varargs
        /*System.out.println("Nothing when argument is only return array" + sum());
        System.out.println("The sum of 4 and 5 is: " +sum(4,5) );
        System.out.println("The sum of 4, 5 and 9 is: " +sum(4,5,9) );
        System.out.println("The sum of 4, 5, 10 and 11 is: " +sum(4,5,10,11) );*/

        // Recursion
        /*int c= 4 ;
        System.out.println(factorial(c));*/



    }
}
