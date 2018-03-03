public class apples {
    public static void main(String[]args) {

        System.out.println("Index\tValue"); //Will create a table
        int myArray[] = {5, 2, 800, 21, 9, 13, 4, 1, 27, 44};
        System.out.println(myArray.length);
        System.out.println(myArray[7]);



        for(int counter=0; counter<myArray.length; counter++){
            System.out.println(counter + "\t" + myArray[counter]);
        }
    }
}

/*Solution for the counter myArray section is:
0 5
1 2
2 800
3 21
4 9
etc...meaning in index 0 is number 4, in index 1 is number 2...
 */