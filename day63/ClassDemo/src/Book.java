public class Book implements Printable{
    
    public String name;
    public int year;

    public Book(){}

    public void print(String name) {
        System.out.println("This is the book: " + name);
    }

}
