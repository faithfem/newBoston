import java.util.Scanner;

public class apples {

    public static void main(String[]args){

        Scanner gonyo = new Scanner(System.in);
        System.out.println("Enter name here ");
        String temp = gonyo.nextLine();

        tuna tunaObject = new tuna("Kelsey " + temp); //Constructor is used in here
        tuna tunaObject2 = new tuna("Julie " + temp);
        tunaObject.simpleMessage();
        tunaObject2.simpleMessage2();






    }
}
