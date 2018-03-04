import java.util.LinkedList;
import java.util.List;

public class faith {
    public static void main(String[]args){
        String[] things = {"apples", "noobs", "bacon", "sheep"};
        List<String> list1 = new LinkedList<String>();

        for(String z: things)
            list1.add(z);


        String[] things2 = {"sausage", "bacon", "goats","harryporter"};
        List<String> list2 = new LinkedList<>();
        for(String y: things2)
            list2.add(y);

        list1.addAll(list2);

        System.out.println(list1);



    }
}
