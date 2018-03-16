public class Dog {



    //1. START: CONSTRUCTOR AND INSTANT VARIABLES

            // a constructor is created OUTSIDE OF THE MAIN CLASS
            // a constructor is named exactly like the class except
            // u don't use the world class

    int age;

    public Dog(int dogsAge){ //Add PARAMETERS to constructor
        age = dogsAge;
    }



    //2a. CREATE A METHOD TO USE IN MAIN METHOD

    public void walkDog(){
        System.out.println("My dog cannot walk as he is " + age + " years old");
    }


    //2b. CREATE A METHOD TO USE IN MAIN METHOD
    public void bark(){
        System.out.println("My dog cannot bark. He is " + age + " years old");
    }


    //2c. CREATE A METHOD WITH PARAMETERS, TO USE IN MAIN METHOD
    public void drive(int distanceInMiles){
            System.out.println("I drove " + distanceInMiles + " miles with Binny my " +
                    "old, lame dog");
        }

    //2d. CREATE A METHOD WITH A RETURN
    public int numberOfLegs(){
        return 4;
    }


    //3.MAIN METHOD

    public static void main(String[]args){
        Dog oldDog = new Dog(21);
        oldDog.walkDog();
        oldDog.bark();
        oldDog.drive(10000);
        int Legs = oldDog.numberOfLegs();
        System.out.println(Legs);
    }

}
