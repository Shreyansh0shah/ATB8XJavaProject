package sept.pq_Abstraction;

public class PrintMyBook extends Book{

    public PrintMyBook(String name, String author, double price) {
        super(name, author, price);
    }

    @Override
    void getDetails() {
        System.out.println(name);
        System.out.println(author);
        System.out.println(price);
    }
}
