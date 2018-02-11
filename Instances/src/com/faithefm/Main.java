package com.faithefm;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      Instance InstanceObject = new Instance();
        System.out.println("Enter girl's name here: ");
        String temp = input.nextLine(); //What user enters, will be stored in variable "temp"
        InstanceObject.setName(temp); //Takes variable "temp" and uses it in the method called "setName" from Instance Class
        InstanceObject.saying(); //Calls the Method "saying" from Instance Class


    }
}
