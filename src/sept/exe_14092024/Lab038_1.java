package sept.exe_14092024;

public class Lab038_1 {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        int c= 45;
        // finding the max value
        int max =(a>b && a>c) ? a:(b>c? b:c);
        // finding the min value
        int min =(a<b && a<c)? a:(b<c ? b:c);

        System.out.println("Max Value"+max);
        System.out.println("Min Value"+min);

    }
}
