package sept.pq_Abstraction;

abstract class Book {
    protected String name;
    protected String author;
    protected double price;
    //constructor
    public Book(String name, String author, double price){
        this.name = name;
        this.author = author;
        this.price= price;
    }
    abstract void getDetails();
}
