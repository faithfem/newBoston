package com.faithefm;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Name nameObject = new Name(); //Create object to connect the Name Class to Main Class

        System.out.println("Enter your name here: ");
        String name = input.nextLine(); //A variable that we call "name" is equal to whatever input user will type in

        nameObject.simpleMessage(name); //This calls the method in the Name Class


        }
}
