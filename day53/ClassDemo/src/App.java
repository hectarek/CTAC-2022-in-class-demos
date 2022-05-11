import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        // DEMO
//        BankAccount acc = new BankAccount("Hector", 500);
//        acc.deposit(100.00);
//        System.out.println(acc.toString());
//
//        Product gumballs = new Product("Gumball(s)", 0.25, 5);
//        gumballs.printProduct();
//        gumballs.totalCost();

        // STATE OF AN OBJECT
//        Rectangle rec = new Rectangle(5,6);
//
//        System.out.println(rec.getWidth());
//        System.out.println(rec.getHeight());
//        rec.widen();
//
//        System.out.println(rec.toString());
//        ArrayList<Person> people = new ArrayList<>();

//        Person joe = new Person("Joe", 45, 68.0, 150);
//
//        people.add(joe);
//        people.add(new Person("Irena", 38, 53.0, 162));
//        people.add(new Person("Jesus", 28, 51.0, 160));

//        for ( Person person : people) {
//            System.out.println(person.getName());
//            System.out.println(person.getAge());
//            person.growOlder();
//            System.out.println(person.getAge());
//            System.out.println(person);
//            System.out.println(" === next person ===");
//        }

        Person gloria = new Person("Gloria", 79, 46.6, 135.4);
        Person manuel = new Person("Manuel", 34);

//        System.out.println(manuel);
//        System.out.println(manuel.getWeight());
//        System.out.println(manuel.bodyMassIndex());
        manuel.setHeight(168);
        manuel.setWeight(79);
        System.out.println(manuel.bodyMassIndex());

        App.main(124);
        App.main("This is a sentence");
    }

    public static void main(int ints) {
        System.out.println("Here are the " + ints);
    }
    public static void main(String sentence) {
        System.out.println(sentence);
    }
}
