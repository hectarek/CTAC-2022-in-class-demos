import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // Basics of HashMaps
//        HashMap<String, String> translatedNumbers = new HashMap<>();
//        translatedNumbers.put("One", "ichi");
//        translatedNumbers.put("Two", "ni");
//        translatedNumbers.put("Three", "san");
//        translatedNumbers.put("Four", "shi/yon");
//
//        System.out.println(translatedNumbers.get("One"));

        // Keys Only go to one value
//        HashMap<String, String> numbers = new HashMap<>();
//        numbers.put("Uno", "One");
//        numbers.put("Dos", "dwa");
//        numbers.put("Uno", "jeden");
//
//        String translation = numbers.get("Uno");
//        System.out.println(translation);
//
//        System.out.println(numbers.get("Dos"));
//        System.out.println(numbers.get("Tres"));
//        System.out.println(numbers.get("Uno"));

        // You can even use objects in hashmaps
//        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
//        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");
//
//        HashMap<String, Book> directory = new HashMap<>();
//        directory.put(senseAndSensibility.getName(), senseAndSensibility);
//        directory.put(prideAndPrejudice.getName(), prideAndPrejudice);

        // What if we wanted to find the age of a tree
//        ArrayList<Tree> trees = new ArrayList<>();
//
//        trees.add(new Tree("Cedar", 1));
//        trees.add(new Tree("Fir", 14));
//        trees.add(new Tree("Ash", 23));
//        trees.add(new Tree("Redwood", 68));
//        trees.add(new Tree("Aspen", 53));
//
//        System.out.println(findTree(trees, "Redwood") + "\n");
//        System.out.println(findTree(trees, "Aspen"));

        // Instead, we can use a HashMap
//        HashMap<String, Integer> treesMap = new HashMap<>();
//
//        treesMap.put("Cedar", 1);
//        treesMap.put("Fir", 14);
//        treesMap.put("Ash", 23);
//        treesMap.put("Redwood", 68);
//        treesMap.put("Aspen", 53);
//
//        System.out.println(treesMap.get("Redwood") + "\n");
//        System.out.println(treesMap.get("Aspen"));


        // You can also use HashMap as a instance Variable
//        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
//        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");
//
//        Library library = new Library();
//        library.addBook(senseAndSensibility);
//        library.addBook(prideAndPrejudice);
//
//        System.out.println(library.getBook("pride and prejudice");
//        System.out.println();
//
//        System.out.println(library.getBook("PRIDE AND PREJUDICE");
//        System.out.println();

//        System.out.println(library.getBook("SENSE"));

        // Interfaces
//        Motorcycle yamaha = new Motorcycle("Yamaha", "YZF-R1M", 2021);
//        Car toyota = new Car("Yamaha", "YZF-R1M", 2021);
//         OR
        Vehicle yamaha = new Motorcycle("Yamaha", "YZF-R1M", 2021);
        Vehicle toyota = new Car("Yamaha", "YZF-R1M", 2021);

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(yamaha);
        vehicles.add(toyota);


    }

    public static int findTree(ArrayList<Tree> trees, String name) {
        for (Tree tree: trees) {
            if (tree.getName().equals(name)) {
                return tree.getAge();
            }
        }
        return -1;
    }

}
