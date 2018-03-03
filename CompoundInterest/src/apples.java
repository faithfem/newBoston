public class apples {
    public static void main(String[]args){

        //HOW MUCH INTEREST IN 20 DAYS IF RATE IS 0.01 PER DAY
        //Compound Interest formula is; A=P(1+R)^n
        //A=Amount of Interest
        //P=Principal
        //R=Rate
        //n=Number of years
        //Formula: A = P(1+R)^n

        //Declare variables
        double amount;
        double principal = 10000;
        double rate =.01;

        for(int day =1; day<=20;day++){
            amount = principal*Math.pow(1 + rate, day);
            System.out.println(day + " " + amount);

        }

    }

}
