package sept.exe_15092024;
import java.util.Scanner;
public class lab050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of  side 1");
        double side1 =sc.nextDouble();
        System.out.println("Enter the length of  side 2");
        double side2 =sc.nextDouble();
        System.out.println("Enter the length of  side 3");
        double side3 =sc.nextDouble();
        if (side1>=1 && side2>=1 && side3>=1){

        if( side1 == side2 && side1 == side3 && side2 == side3){
            System.out.println("Equalateral");
        }else if(side1 == side2 || side1 == side3 || side2 == side3){
            System.out.println("isolater");
        }else {
            System.out.println("scalene");
        }}
        System.out.println("its a negetive value");

    }
}
