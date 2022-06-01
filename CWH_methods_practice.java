package com.company;

public class CWH_methods_practice {
    //multiplication table
    /*static void mul_table(int n){
        for(int i = 0; i<=10; i++){
            System.out.printf("%d x %-2d = %d\n", n, i, i*n);
        }

    }*/
    // printing stars right align
   /* static void stars(int n){
        for(int i = 0; i<=n;i++){
            for(int j=0; j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }*/
    // printing stars descending order align
    static void dec_stars(int n){
        for (int i=n;i>=0;i--){
            for (int j=0;j<=i;j++ ){
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    // recursive function
   /* static int sum_recursive(int n){
        if(n==0 || n==1){
            return n;
        }
        else {

           return n+sum_recursive(n-1);
        }

    }*/

    public static void main(String[] args) {

        //multiplication table
       // mul_table(7);

        // printing stars right align
        //stars(4);

        //recursive function
        /*int i = 3;
        System.out.println(sum_recursive(i))*/;

        //printing stars on reverse
        /*dec_stars(4);*/


        // do not use
    }
}
