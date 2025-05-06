package sept.staticKeyword;

public class Lab064 {
    public static void main(String[] args) {
//        ATB s1 =new ATB("Shah");
//        ATB s2 = new ATB("Suraj");
//        ATB s3 =new ATB ("Tushar");
//        ATB s4;

    }

}
class ATB {
    {
        System.out.println("IIB");
        System.out.println("Reading from CSV file");
    }

    static {
        System.out.println("Load the class?, I will execute");
    }

    private String name;
    private long Phone;
    static String courseName = "ATB8x";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void readDocument(){
        System.out.println("Non Static method");
    }
    static void doAssignment(){
        System.out.println("Do Assignment");
    }
}
