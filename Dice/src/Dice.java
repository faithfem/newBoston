import java.util.Random;

public class Dice {

    public static void  main(String[]args){

        //Creating dice with 6 sides
        //Create an array with 6 sides

        //int face[] = {0,1,2,3,4,5};
        int freq[] = new int[7];
        Random rand = new Random();

        for(int roll=1; roll<100; roll++){
            ++freq[1+rand.nextInt(6)];
        }

        System.out.println("Face\tFrequency");

        for(int face=0; face<freq.length;face++){
            //System.out.println(face+"\t"+ Arrays.toString(freq));
            System.out.println(face+"\t"+freq[face]);
        }



    }
}
