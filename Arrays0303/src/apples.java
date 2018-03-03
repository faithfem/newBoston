public class apples {
    public static void main(String[]args){
        //System.out.println("I am at the library");

        //ARRAYS

        //FIRST SECTION BELOW MEANS TYPING EVERY ARRAY WHICH IS TIME CONSUMING
        int myArray[] = new int[10];//10 is number of variables to be stored in the array named myArray

        myArray[0]=87;
        myArray[1]=9;

        System.out.println(myArray[0]);
        System.out.println(myArray[1]);

        //BETTER OPTION

        int myArray2[]={2,4,8,12,15,99,107,11,26,23,9};
        System.out.println(myArray2[8]); //Ans=8
        System.out.println(myArray2.length); //Ans=11

    }
}
