package sept.exe_14092024;

import java.sql.SQLOutput;

public class Lab043_7 {
    public static void main(String[] args) {
            int num1 = 13 ;
            int num2 = 10;
            char op ='+';

            int result = 0;
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = (num2 != 0) ? num1 / num2 : 0;
                    break;
                case '%':
                    result = (num2 != 0) ? num1 % num2 : 0;
                    break;
            }
                System.out.println("Result "+ result );


      }
    }
