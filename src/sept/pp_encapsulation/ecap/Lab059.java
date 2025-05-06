package sept.pp_encapsulation.ecap;

public class Lab059 {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin","password123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "hacker";
        System.out.println(vwoLogin.password);

        GoodVWOLogin vwoLogin1=new GoodVWOLogin("admin","Goodadmin");
       // System.out.println(vwoLogin1.password);
        //vwoLogin1.password = "passwprd12">?
        System.out.println(vwoLogin1.getPassword());
        // Checking
        boolean isAdmin = false;
        vwoLogin1.setYourKey("admin");
        vwoLogin1.setPassword("newpassword",isAdmin);
        System.out.println(vwoLogin1.getPassword());
    }
}
