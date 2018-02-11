package com.faithefm;
//import java.util.Scanner;

public class Main {
    public static void main(String []args){
//        Scanner faith = new Scanner(System.in);
//        System.out.println(faith.nextLine());

        //TO RELATE THIS CLASS TO TUNA CLASS, FIRST CREATE AN OBJECT OF THE TUNA CLASS
//        Tuna tunaObject = new Tuna();
//        tunaObject.simpleMessage(); //CALLS THE METHOD FROM THE TUNA CLASS = Method 1

        //tunaObject.foodMessage(); //Method 2

        Bread theBread = new Bread(2, "Italian");
        Tuna theTuna = new Tuna();

        Sandwich theSandwich = new Sandwich(theBread, theTuna);

        theSandwich.getBread().useSlices();
        theSandwich.getTuna().foodMessage(); //Method 2 in Tuna Class


    }
}
