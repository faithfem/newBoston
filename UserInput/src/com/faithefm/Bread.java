package com.faithefm;

public class Bread {

    private int numOfbreadSlices;
    private String typeBread;

    //CONSTRUCTOR

    public Bread(int numOfbreadSlices, String typeBread){
        this.numOfbreadSlices = numOfbreadSlices;
        this.typeBread = typeBread;
    }

    //METHODS
    public void useSlices(){
        System.out.println(numOfbreadSlices + " slices of " + typeBread + " bread, please");
    }

    //GETTERS
    public int getNumOfbreadSlices() {
        return numOfbreadSlices;
    }

    public String getTypeBread() {
        return typeBread;
    }
}
