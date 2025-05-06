package sept.pp_encapsulation;

public class Lab061 {
    class Car extends Vehicle {
        private int maxSpeed = 281;

        Car() {
            super();
        System.out.println("DC Car");

}}
}
class Vehicle{
    public int maxSpeed =180;
    Vehicle(){
        System.out.println("DC Vehicle");
    }
    Vehicle(int a){
        System.out.println("PC Vehicle");
    }
    void message(){
        System.out.println("Hello Vehicle");
    }
    void message(int a){
        System.out.println("Hello Vehicle");
    }
}