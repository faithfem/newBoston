package com.faithefm;

public class Instance {

    private String girlName; //This variable is outside a method. It's an instance variable
    public void setName(String name){   //Method 1
        girlName = name;
    }

    public String getName() {
        return girlName;
    }

    public void saying(){ //Method 2. You can use multiple methods in one class. Instance methods
        System.out.printf("That girl's name is %s", getName());
    }
}
