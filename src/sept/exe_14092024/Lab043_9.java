package sept.exe_14092024;

public class Lab043_9 {
    public static void main(String[] args) {
        int choice = 2;
        double input= 0.5;
        double result =0;

        switch(choice){
            case 1:
                result=input * 0.621371;
                break;
            case 2:
                result = (input * 9/5) + 32;
                break;
        }
        System.out.println(result);
    }
}
