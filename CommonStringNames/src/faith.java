public class faith {
    public static void main (String[]args){

        //declare variables in string called "words"
        String[] words = {"funk", "chunk", "furry", "baconator"};

        //find words that start with

        for(String k : words){ //String "k" - can name the variable anything
            if(k.startsWith("fu"))
                System.out.println(k + " starts with fu");
        }

        for(String k : words) { //String "k" - can name the variable anything
            if (k.endsWith("k"))
                System.out.println(k + " ends with k");
        }

    }
}
