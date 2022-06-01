package com.company;



import java.util.Random;
import java.util.Scanner;

class Games{

    public  int number;
    public int noOfGuess=0;
    public int inputNumber;

     Games(){
        Random rand= new Random();

        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number: ");
        Scanner sc=new Scanner(System.in);
        inputNumber=sc.nextInt();
        noOfGuess++;


    }
    boolean isCorrectNumber(){

        if(inputNumber==number){
            //noOfGuess++;
            System.out.printf("You guessed the correct number that is %d, you attempt %d times ", number, noOfGuess);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too less...");

        }
        else if(inputNumber>number){
            System.out.println("Too high.....");
        }
        return false;
    }
}

public class CWH_guess_TheNum {
    public static void main(String[] args) {

        Games g = new Games();
        boolean b=false;

       while (!b){
           g.takeUserInput();
          b=  g.isCorrectNumber();
           System.out.println(b);
       }


    }

}
