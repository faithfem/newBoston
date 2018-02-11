package com.faithefm;

public class salami {
        private String girlName; //Initiating variable

        public salami(String name){ //Constructor (Method named as the class)
            girlName = name; //Took variable "girlName" and passed it to "name"
        }

//        public String getName(){ //Getter
//            return girlName;
//        }

        //METHOD
        public void saying(){
//            System.out.printf("Her name is %s\n", getName());
            System.out.println("Her name is " + girlName);

        }

}

//I get the same answer using the Getter as I do without it (example above with getters commented out).
//So why exactly would we prefer to use the getter instead of straight up code as above?