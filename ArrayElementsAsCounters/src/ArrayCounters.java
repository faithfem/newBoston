import java.util.Random;

public class ArrayCounters {

    public static void main(String[]args){

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



        //PRACTICE - NOTHING TO DO WITH ARRAY COUNTERS
        //create array and name it faith
        int faith[] = {1,21,11};



        //THINGS YOU CAN PRINT FROM THIS CLASS
        System.out.println(faith.length); //tells us the number of elements in array
        System.out.println(faith[0]); //prints the first element
        //THE NEXT 3 LINES GO TOGETHER
        System.out.println("Index\tValue");
        for (int counter = 0; counter<faith.length; counter++){
        System.out.println(counter + "\t " + faith[counter]);
        }

    }
}
