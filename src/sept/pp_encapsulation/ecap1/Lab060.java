package sept.pp_encapsulation.ecap1;

public class Lab060 {
    public static void main(String[] args) {
        ICICIBank shah = new ICICIBank("shsh",100);
        //shah.setBal(100000);
        boolean are_you_admin =true;
        ICICIBank admin = new ICICIBank("shah",100);
        admin.setBal(50000,true);
        System.out.println(admin.getName(are_you_admin));
    }
}
