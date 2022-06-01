package com.company;
import java.util.Scanner;
import java.util.Random;

public class cwh_rock_paper_game {
    public static void main(String[] args) {
        String [] arr = {"r", "p", "s"};
        Random random = new Random();
        String arr_ran = arr[random.nextInt(arr.length)];
        System.out.println(arr_ran);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Rock = \"R\" , Paper = \"P\", Scissor = \"S\". ");
        String input = sc.next();

         if (input.equalsIgnoreCase("r")){
             if (arr_ran=="r"){
                 System.out.printf("WON!");
             }
             else {
                 System.out.println("lost!");
             }
        }
        else if (input.equalsIgnoreCase("p")){
            if (arr_ran=="p"){
                System.out.printf("WON!");
            }
            else {
                System.out.println("lost!");
            }
        }
         else if (input.equalsIgnoreCase("s")){
             if (arr_ran=="s"){
                 System.out.printf("WON!");
             }
             else {
                 System.out.println("lost!");
             }
         }
         else  {
             System.out.printf("Please try again!");
         }

    }
}
