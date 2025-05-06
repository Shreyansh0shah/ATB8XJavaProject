package Task.Task_1_sept;

public class Task2_5even {
    public static void main(String[] args) {
        // Print the First 5 Even Numbers
        int count =0;
        int number=2;
        do {
            System.out.println(number);
            number += 2;
            count++;
        }while(count<5);
    }
}
