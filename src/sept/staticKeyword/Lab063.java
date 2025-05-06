package sept.staticKeyword;

public class Lab063 {
// static keyword in Java is a non-access modify that is primarily use for memory
// management and to define class-level variable and methods.

   // Static variables are variables which are created at the time of the class loading

    // IIB -> instance initialization Block
    //SIB -> Static initialization Block

    // 1.variable, 2.block, 3.method, 4.class.
    public static void main(String[] args) {
        A a =new A();
        A a1 = new A();
        new A();
        A a2;

    }
}
class A {
    {
        System.out.println("IIB");
    }
    static {
        System.out.println("SIB");
    }
}