public class tuna {
    private String Itinariri; //declare variable

    //CONSTRUCTOR:
    //Helps you initialize variables as soon as you create
    //an object
    public tuna(String name) { //create Constructor
        Itinariri = name; //Constructor initializes variable
    }

    //See below, you can have many different methods
    public void simpleMessage(){
        System.out.println("Her name is " + Itinariri);
    }

    public void simpleMessage2(){
        System.out.println("Her name is not " + Itinariri);
    }

}
