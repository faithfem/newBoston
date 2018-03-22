public class Whatevs {

    public static void main(String[]args){

        int firstArray[][]={{1,2,5,9,7}, {5,3,14,9,7}}; //first part is the row, second part is the column
        int secondArray[][]={{15,35,99,75,78}, {19,32,61,43,25},{44,57}};

        //Call the method below
        System.out.println("This is the first array");
        display(firstArray);

        System.out.println("This is the second array");
        display(secondArray);

    }
    //Method to print the arrays
    //Loop through the row
    //Loop through the column
    //Print rows and columns
    //Create rows in separate lines
    public static void display(int x[][]){ //create the method (called display)
            for(int row=0;row<x.length;row++){ //creates the Row
                for(int column=0;column<x[row].length;column++){ //creates the Column
                    System.out.print(x [row][column] + "\t"); //prints the Row
                }
                System.out.println(); //new line to indicate, print to separate rows

            }
            }
}
