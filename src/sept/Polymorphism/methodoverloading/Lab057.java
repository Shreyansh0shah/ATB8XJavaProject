package sept.Polymorphism.methodoverloading;

public class Lab057 {
    public static void main(String[] args) {
        Mathoperations m =new Mathoperations();

        int result = m.add( 3,4);
        System.out.println(result);

        String name = m.add(  "shah","hahs");
        System.out.println(name);
    }

}
