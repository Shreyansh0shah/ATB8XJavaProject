package sept.exe_15092024;
import java.util.Scanner;
public class Lab049 {
    public static void main(String[] args) {
        //Fizz buzz problem
        // write a program that prints numbers from 1 to 100.
        // However, for multiples of 3, print " fizz" instead of the number,
        // and for multiples of 5, print "buzz."
        //for numbers that are multiples of both 3 and 5,
        // print "FizzBuzz"


        //Logic Building
        //step 1
        //input ->
        // output->
        //start
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number n =100");
        int n = sc.nextInt();

        for(int i = 1; i<=100; i++){
         if( i % 3 ==0 && i %5 ==0 ){
             System.out.println("FizzBuzz");
         } else if(i % 3 == 0 ){
             System.out.println("Fizz");
         } else if (i % 5 == 0){
            System.out.println("Buzz");
        }else
            System.out.println(i);


    }}}
