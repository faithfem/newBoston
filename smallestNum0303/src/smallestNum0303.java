

public class smallestNum0303 {

    public static int findSmallestNum(int[] args) {

        System.out.println("The numbers " + args);
        //Declare variable

        int num = args[0];

        for (int i = 0;i<args.length;i++ ){
            if (num > args[i]) {
                num = args[i];
            }
        }
            return num;
    }
}

