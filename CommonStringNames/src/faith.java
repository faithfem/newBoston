public class faith {
    public static void main (String[]args){

        //declare variables in string called "words"
        String[] words = {"funk", "chunk", "furry", "baconator"};

        //find words that start with

        for(String w : words){
            if(w.startsWith("fu"))
                System.out.println(w + " starts with fu");
        }

    }
}
