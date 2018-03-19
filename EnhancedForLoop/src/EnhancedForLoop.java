public class EnhancedForLoop {

    public static void main(String[]args){

        int faith[] = {3,4,5,6,7};
        int total = 0;

        for (int x: faith){
            total+=x;
        }

        System.out.println(total);


        //SHOPPING LIST ARRAY - EASIER TO UNDERSTAND THAN ABOVE

        String faithShoppingList[] = {"eggs", "bread", "butter", "milk", "water"};
        System.out.println("1. " + faithShoppingList[3]);

        for(String list: faithShoppingList){
            System.out.println(list);
        }


    }
}
