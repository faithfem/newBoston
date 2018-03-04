public class faith {
    public static void main(String[]args){

        String x = "faithessyfaithessyfaithessy";
        String k = "essyfaith";
        System.out.println(x.indexOf("t")); //returns first instant of t
        System.out.println(x.indexOf("t", 2));//find instance of first t but ignores the first 2 t's it finds
        System.out.println(k.compareTo("t"));

        String a = "Bacon";
        String b = " fries";
        System.out.println(a + b);
        System.out.println(a.concat(b));
        System.out.println(a + b.replace("fries", "and eggs"));

        //Changing to lowercase & uppercase
        System.out.println(a.toUpperCase() + b.toUpperCase());

    }
}
