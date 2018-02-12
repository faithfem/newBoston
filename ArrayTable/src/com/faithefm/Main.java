package com.faithefm;

public class Main {

    public static void main(String[] args) {
        System.out.println("Index\tValue"); //The \t creates 5 tabs (spaces) between index and value

        int shiku[] = {32,12,18,54,2};

        //create a for-loop to loop through each number in the array. Starts at zero level

        for(int counter = 0; counter<shiku.length; counter++) { //counter depends on how long array is
            System.out.println(counter +"\t" + shiku[counter]);
        }
    }
    //Try Caesar Cipher after this
    //Try Derek Bana's Hashmap
}
