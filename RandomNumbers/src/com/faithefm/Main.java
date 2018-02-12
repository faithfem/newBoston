package com.faithefm;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random dice = new Random();
        int number;

        for (int counter = 1; counter<=10; counter++){
            number = 1+dice.nextInt(6); //Using 1 means no zero's generated
            System.out.println(number + " ");
        }


    }
}
