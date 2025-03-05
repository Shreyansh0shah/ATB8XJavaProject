package sept.exe_14092024;

public class Lab043_0Switch {
    public static void main(String[] args) {
        String browser ="opera";

        switch(browser){
            case "chrome":
                System.out.println("Starting the chrome browser");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                break;
            case "edge":
                System.out.println("Starting the edge browser");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;
        }
    }
}
