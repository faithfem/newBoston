public class apples {
    public static void main(String[]args){
        int myArray[]={1,0,8,1};
        int sum= 0;
        //To Sum up arrays
        System.out.println(myArray[1] + myArray[2]);
        System.out.println("1. Numbers are " + myArray[0]+ " and " + myArray[2]);
        System.out.println("2. Numbers are " + myArray[0] + " and " + myArray[1]);
        System.out.println(+ myArray[0] + myArray[2]);
        System.out.println(3 + myArray[0] + myArray[2]);
        System.out.println("3" + myArray[0] + myArray[2]);



    for (int counter = 0; counter<myArray.length; counter++){
        sum+=myArray[counter];
    }
        System.out.println("The sum is " + sum);

    }
}
