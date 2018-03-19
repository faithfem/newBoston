public class ChangeArray {

    public static void main(String[]args) {

//        int faith[] = {0, 7, 9, 15, 22, 37};
//        change(faith);
//
//        for (int list : faith)
//            System.out.println(list);


        //ANOTHER ARRAY - EASIER TO UNDERSTAND
        String shoppingList[]={"milk", "eggs", "bread","water"};
        change(shoppingList);

        for (String sList: shoppingList)
            System.out.println(sList);
    }

    //Create a method for change
//    public static void change(int x[]){
//        for(int counter=0; counter<x.length;counter++)
//            x[counter]+=0;
//    }

    //Method for shopping list change
    public static void change(String sList[]){
        for(int counter=0; counter<sList.length;counter++) {
            sList[counter] += " List";
        }
    }


}
