package com.company;
import java.util.Scanner;

public class CWH04_literals {
    public static void main(String[] args) {
        System.out.println("The marks of 5 subjects");
       Scanner sc = new Scanner(System.in);
        System.out.print("Subject 1: ");
       float s1 = sc.nextFloat();
        System.out.print("Subject 2: ");
       float s2 = sc.nextFloat();
        System.out.print("Subject 3: ");
       float s3 = sc.nextFloat();
        System.out.print("Subject 4: ");
       float s4 = sc.nextFloat();
        System.out.print("Subject 5: ");
       float s5 = sc.nextFloat();

        float sum= s1 + s2+ s3+ s4+ s5;
        float avg = sum/5;
        System.out.println("The average of total marks: " + avg + "%");



    }
}
