package sept.exe_14092024;

public class Lab043_3 {
    public static void main(String[] args) {
        int itemcode = 001;
          // ( "->" eliminate the break statement)
        switch (itemcode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            default -> System.out.println("Helloo!");
        }
    }
}
