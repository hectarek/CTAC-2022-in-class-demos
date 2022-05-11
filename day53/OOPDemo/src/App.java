import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Account Demo

        // Product Demo

        // Scanner reader = new Scanner(System.in);
        // System.out.println("What's your name?");
        // String name = reader.nextLine();
        // System.out.println("What's your age?");
        // int age = Integer.valueOf(reader.nextLine());
        // System.out.println("What's your weight?");
        // double weight = Double.valueOf(reader.nextLine());
        // System.out.println("What's your height?");
        // double height = Double.valueOf(reader.nextLine());

        // Person person = new Person(name, age, weight, height);
        // System.out.println(person);

        // STATE OF AN OBJECT

        // Rectangle rec = new Rectangle(10, 8);

        // System.out.println("Rectangle Dimensions: " + rec.toString());
        // System.out.println("Rectangle Surface Area: " + rec.surfaceArea());
        // rec.widen();
        // System.out.println("Rectangle Dimensions: " + rec.toString());
        // System.out.println("Rectangle Surface Area: " + rec.surfaceArea());

        // ADDING OBJECTS TO A LIST

        // ArrayList<Person> persons = new ArrayList<>();
        // // a person object can be created first
        // Person john = new Person("John", 31, 81.2, 182);
        // // and then added to the list
        // persons.add(john);

        // // person objects can also be created "in the same
        // // sentence" that they are added to the list
        // persons.add(new Person("Matthew", 27, 74.0, 174));
        // persons.add(new Person("Martin", 74, 68.9, 163));

        // for (Person person : persons) {
        // person.getAge();
        // person.getName();
        // System.out.println(person);
        // }

        // Scanner scan = new Scanner(System.in);

        // while (true) {
        // System.out.print("Enter a name, empty will stop: ");
        // String name = scan.nextLine();
        // if (name.isEmpty()) {
        // break;
        // }

        // // Add to the list a new person
        // // whose name is the previous user input
        // persons.add(new Person(name));
        // }

        // To String Method

        Person gloria = new Person("Gloria", 43);

        System.out.println(gloria);

        Person per = gloria;

        System.out.println(per);

        // Overloading Main
        App.main("Hey, this will also run! Nice");
        App.main("This output", "that output");
    }

    public static void main(String arg1) {
        System.out.println("First overloaded main() method executed");
    }

    public static void main(String arg1, String arg2) {
        System.out.println("Second overloaded main() method executed");
    }
}
