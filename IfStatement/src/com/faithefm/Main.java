package com.faithefm;

public class Main {

    public static void main(String[] args) {

        //Variables
        int test = 6;

        if (test <= 9){
            System.out.println("test is less than or equal to 9");
        } else{
            System.out.println("test is not equal to 9");
        }

        //Operators
        int boy, girl;
        boy = 9;
        girl = 70;
        if(boy > 10 || girl <60){
            System.out.println("You can enter");
        } else{
            System.out.println("You cannot enter.");
        }

        //Switch Statemeent
        //Variables

        int age;
        age = 10;

        switch (age){
            case 1:
                System.out.println("You can crawl");
                break;

            case 2:
                System.out.println("You can talk");
                break;

            case 3:
                System.out.println("You can get in trouble");
                break;

                default:
                    System.out.println("You are not age " + age);
        }

        int counter = 0;
        while (counter <= 10){
            System.out.println(counter);
            counter++;
        }

    }


}
