package sept.exe_15092024;

import java.sql.SQLOutput;

public class Lab044 {
    public static void main(String[] args) {
        for (int i =0; i <= 50; i++){
            if (i%2 ==0){
                System.out.println("Even ->" +i);
                continue;
            }
            System.out.println(i);
        }
    }
}
