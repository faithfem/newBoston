public class faith {
    public static void main(String args[]){
        System.out.println(fact(5));
    }

    public static long fact(long n){

        if(n<=1)
            return 1; //coz factorial of 0 or 1 is 0

        else
            return n * fact(n-1);
    }

}

