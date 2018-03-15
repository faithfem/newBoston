public class Dog {



    //1. START: CONSTRUCTOR AND INSTANT VARIABLES

            // a constructor is created OUTSIDE OF THE MAIN CLASS
            // a constructor is named exactly like the class except
            // u don't use the world class


    int age;

    public Dog(int dogsAge){ //Add PARAMETERS to constructor
        age = dogsAge;
    }

    //1. END: OF CONSTRUCTOR



    //2. CREATE A NEW METHOD TO USE IN MAIN METHOD

    public void walkDog(){
        System.out.println("My dog cannot walk as he is " + age + " years old");
    }


    //3. CREATE A NEW METHOD TO USE IN MAIN METHOD
    public void bark(){
        System.out.println("My dog cannot bark. He is " + age + " years old");
    }





    //3.MAIN METHOD

    public static void main(String[]args){
        Dog oldDog = new Dog(21);
        oldDog.walkDog();
        oldDog.bark();

    }

}
