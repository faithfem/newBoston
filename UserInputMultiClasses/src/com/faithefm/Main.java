package com.faithefm;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner gonyo = new Scanner(System.in);
        tuna tunaObject = new tuna();

        System.out.println("Enter your name here: ");
        String ITINARIRI = gonyo.nextLine();

        tunaObject.simpleMessage(ITINARIRI);


    }
}
