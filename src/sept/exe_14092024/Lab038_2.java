package sept.exe_14092024;

public class Lab038_2 {
    public static void main(String[] args) {
        int score =85;
                //Using the ternary operation to assign a grade
        String grade = (score >= 90)? "A":(score>=80)?"B":(score>=70)?"C":"F";
        System.out.println("Grade:"+grade);
    }
}
