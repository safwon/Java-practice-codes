package com.company;
import java.util.Scanner;
import java.lang.Math;
import java.lang.*;
import java.io.*;
import java.util.*;

import java.util.Scanner;

//  Methods


public class practice_CWH {

    //Anagram
    /*static boolean isAnagram(String a, String b) {

        StringBuilder x=new StringBuilder();


        x.append(a.toLowerCase());
        x.reverse();

        return x.toString().toLowerCase().equals(b)
                || a.toLowerCase().equals(b);

        //return x.toString().toLowerCase().equals(b);
    }*/
    public static void main(String[] args) {
        /*float a = 7/4.0f*9/2.0f;
        System.out.println(a);*/

      /*  Scanner sc = new Scanner(System.in);
        int c= 45;
        System.out.println("The given value is 45");
        System.out.println("Enter the value: ");
        int b = sc.nextInt();

        if (b>c){
            System.out.println("The number " + b +" is greater than "+ c );
        }
        else
            System.out.println("The number " + b +" is less than "+ c );*/

      /* String str = "Jack Power";
        String name = str.toLowerCase();
        System.out.println(name);
        String under = str.replace(" ", "_");
        System.out.println(under);

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = sc.nextLine();
        System.out.printf("Dear %s, Thanks a lot!", name);


        Scanner sc = new Scanner(System.in);
        int in1 = sc.nextInt();
        int in2 = sc.nextInt();
        int in3 = sc.nextInt();
        System.out.println(in1);
        System.out.println(in2);
        System.out.println(in3);*/



//       Print weird odd even
/*        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (n%2!=0){
            System.out.println("Weird");
        }
        else if(n%2==0 && n>=2 && n<=5){
            System.out.println("Not Weired");
        }
        else if(n%2==0 && n>=6 && n<=20){
            System.out.println("Weired");
        }
        else if(n%2==0 && n>20) {
            System.out.println("Not Weird");
        }

        scanner.close();

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(n%2==1 || (n>=6 && n <= 20)){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }
    }

        for (int i=0; i<10;i++){

            if (i==2){
                System.out.println("from loop 2");
               continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }
    }*/


//      Print ****
     /*   int i,a;
        for (i=5;i>0;i--){
            for (a=0; a<i; a++){
                System.out.print("*");
            }
            System.out.println("");

        }*/


//multiplication table
      /*  Scanner sc = new Scanner(System.in);
        System.out.print("What multiplication table do you want: ");
        int n = sc.nextInt();

        int i =1, mul=0;
        for (i=1; i<=10; i++){
            mul= n*i;
            System.out.printf("%d X %d = %d\n" ,n,i, mul);


        }*/


        // Fractional
/*
        int n=10,i,mul;
         for(i=10; i>=0; i--){

             mul= n*i;

             System.out.println(mul);

         }

        int n = 3;
        int i = 1;
        int factorial = 1;
        while  (i<=n){
            factorial *= i;
            i++;

        }
        System.out.println(factorial);
*/


        //array
/*
        float [] arr ={2.5f,5.5f, 3.5f};
         float sum = 0;
         for(int i=0;i<arr.length;i++){
             sum += arr[i];

         }
  with for-each
         for(float v: arr){
             sum +=v;
         }
        System.out.println(sum);

        int [] arr1 ={1,2,3,4,5,6};

        int a= 3;
        int b=0;
        int i=0;
        boolean isArray= false;
        for(int z: arr1) {
            if (a == z) {
                isArray = true;
                break;
            }
        }
         if (isArray){
             System.out.println("present");
         }
         else  {
             System.out.println("not present");
         }
*/

// matrix addition
     /*   int [][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                {0, 0, 0}};

        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // Prints a new line
        }*/

        // Reverse an string

       /* String a = "Sadif";
        int i=0;
        char[] try1= a.toCharArray();


            for (int j=a.length()-1;j>=i;j--){
                System.out.print(try1[j]);
            }*/

        // reverse an array
       /* int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for(int element: arr){
            System.out.print(element + " ");
        }*/

        // maximum of an array
     /*   int [] arr = {1, 21, 3, 68, 5, 34, 67};

        int max=0;

        for (int j : arr) {
            if (j > maz) {
                max = j;
            }
        }*/
        // another way maximum array
     /* int arr1= arr.length;
      for (int i=0;i<arr1;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);*/


// Maximum value
        /*int [] arr = {13, 21, 3, 68, 5, 34, 67};
        int min=Integer.MAX_VALUE;

        for (int e: arr){
            if (e<min){
                min = e;

            }
        }
        System.out.println(min);*/



// String builder or palindrome
        //String a ="My name is sadif";
   /*     String a ="madam";
        String b ="madam1";
        StringBuilder x = new StringBuilder();

        x.append(a);
        x.reverse();

        //System.out.println(y);
       if(x.toString().equals(b)){
           System.out.println("YES");
       }
       else {
           System.out.println("NO");
       }*/


        //Anagram
       /* Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );*/











// don not touch

    }


}
