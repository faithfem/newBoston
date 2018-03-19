public class AppendArray {


    public static void main(String[]args) {

        String shoppingList[]={"milk", "eggs", "bread","water"};
        String muchaiFamily[]={"Mugure", "Wanjiru", "Mucheru", "Kimani"};
        change(shoppingList);
        change(muchaiFamily);

//        for (String sList: shoppingList)
//            System.out.println(sList);

        for(String fList: muchaiFamily)
            System.out.println(fList);
    }

    //Add a word to the end of each item


//    private static void change(String sList[]){
//        for(int counter=0; counter<sList.length;counter++) {
//            sList[counter] += " List";
//        }
//    }

    private static void change(String fList[]){
        for(int counter=0; counter<fList.length;counter++) {
            fList[counter] += " Muchai";
        }
    }


}

//muchaiFamily list should print as follows:
//Mugure Muchai
//Wanjiru Muchai
//Mucheru Muchai
//Kimani Muchai

