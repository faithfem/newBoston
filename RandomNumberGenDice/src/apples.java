import java.util.Random;

//NEED TO IMPORT A UTILITY FUNCTION
public class apples {

    public static void main(String[]args){
        Random dice = new Random();

        //declare variable

        int number;

        for(int NumOfRolls = 1; NumOfRolls<=20;NumOfRolls++){ //number of rolls
            number = 1+dice.nextInt(6); //so only numbers 1 to 6 are returned
            System.out.println(number + " ");
        }
    }

}
