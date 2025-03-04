package sept.exe_14092024;

public class Lab042 {
    public static void main(String[] args) {
        //Great Calculator
        // Write a program that calculates and displays the letter grade for a given numerical
        //score (e.g., A,B,C,D, or F)
        //based on the following grading scale:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

        //1. Find the user Inputs
        // score -> int score = 89 ;
        // return -> data - type - grade -> char

        char grade = 'F';
        int score = 90; // in the future we will get this from the users. input

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else if (score >= 50 && score <= 59) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("Your Grade is -> "+ grade);


    }
}
