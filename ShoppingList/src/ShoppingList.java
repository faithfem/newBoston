public class ShoppingList {


    public static void main(String[] args) {
        String faithShoppingList[] = {"eggs", "bread", "butter", "milk", "water"};

        //Print 1 item from shopping list
        System.out.println(faithShoppingList[3]);



        //Print entire shopping list
        for (String list : faithShoppingList) {
            System.out.println(list);
        }
    }
}