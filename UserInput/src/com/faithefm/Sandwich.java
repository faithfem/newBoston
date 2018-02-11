package com.faithefm;

public class Sandwich {

    private Bread bread;
    private Tuna tuna;

    //CONSTRUCTOR
    public Sandwich(Bread bread, Tuna tuna){
        this.bread = bread;
        this.tuna = tuna;
    }

    //GETTERS
    public Bread getBread(){
        return bread;
    }

    public Tuna getTuna(){
        return tuna;
    }


}
