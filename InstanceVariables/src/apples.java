import java.util.Scanner;

public class apples {

    public static void main(String[] args){
        Scanner gonyo = new Scanner(System.in);
        tuna tunaObject = new tuna();
        System.out.println("Enter name here: ");
        String temp = gonyo.nextLine();
        tunaObject.setItinariri(temp);
        tunaObject.methodIsShiku();

    }


}
