package sept.exe_16092024;

public class Dog {
    public static void main(String[] args) {
    }  String name;
        int age;
        int legs;
        String breed;
        Dog() {
            System.out.println("I am DC");
            System.out.println("God is happy!");
        }
        Dog(String breed) {
            System.out.println("I am PC");
            this.breed = breed;

        }
        Dog(String breed,String name, int age, int legs){
            System.out.println("I am PC");
            this.breed = breed;
           this.age =age;
            this.legs= legs;
        }

        //Defoult constructor
        void walk () {

        }
    }
