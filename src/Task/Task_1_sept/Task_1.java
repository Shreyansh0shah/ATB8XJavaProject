package Task.Task_1_sept;
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a num");
        int n = sc.nextInt();
        int score = n;
        String grade=(score >=90)? "A":(score>=80)? "B":"C";
        System.out.println(grade);
    }
}
