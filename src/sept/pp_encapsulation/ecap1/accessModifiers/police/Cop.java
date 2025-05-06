package sept.pp_encapsulation.ecap1.accessModifiers.police;

public class Cop {
    private int gun;
    private String idCard;

    public Cop(int gun) {
        this.gun = gun;
    }
    public void canIShoot(){
        System.out.println("Yes,You can!!");
    }
}
