package sept.pp_encapsulation.ecap1;

public class ICICIBank {
    private String name;
    private long bal;



    public String getName(boolean isAdmin) {
        if(isAdmin){
            return name;
        }else{
            return "Null";
        }

    }

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,boolean isAdmin) {
        if (isAdmin){
        this.bal = bal;
            System.out.println("Allowed");
    }else{
            System.out.println("Not Allowed!");
        }
    }
}
