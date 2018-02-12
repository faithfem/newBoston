package com.faithefm;

public class Main {

    public static void main(String[] args) {
	// Arrays store values of the same data type only. So integers only or Strings only, etc

        //First type in type of array
        //Square brackets [] indicates it's an array

        int shiku[] = new int[10]; //Name of array is "shiku" and it will store 10 values

        shiku[0]=87;
        shiku[1]=543;
        shiku[9]=65;

        System.out.println(shiku[9]);

        //Array 2
        int shikus[]={2,4,5,6,7,8};
        System.out.println(shikus[2]);
    }
}
