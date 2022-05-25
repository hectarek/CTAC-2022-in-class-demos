import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        
        DaysOfTheWeek day = DaysOfTheWeek.FRIDAY;

        // System.out.println(day);
        // System.out.println(DaysOfTheWeek.values());

        // for (DaysOfTheWeek days : DaysOfTheWeek.values()) {
        //     System.out.println(days + " Is weekday" + days.isWeekDay);
        // }

        // Book myBook = new Book();
        // myBook.print();

        // printThing((name) -> System.out.println("This is the book: " + name));

        // STEAMS 

        List<Person> people = getPeople();

        // System.out.println(people);
        
        // ArrayList<Person> moods = new ArrayList<>();
        
        // for (Person person : people) {
        //     if (person.getMood().equals(Mood.HAPPY)) {
        //         moods.add(person);
        //     }
        // }

        // for (Person pep : moods) {
        //     System.out.println(pep);
        // }

        // List<Person> moods = people.stream()
        //     .filter(person -> person.getMood().equals(Mood.HAPPY))
        //     .collect(Collectors.toList());

        // for (Person mood : moods) {
        //     System.out.println(mood);
        // }

        boolean allMatch = people.stream()
            .allMatch(per -> per.getAge() > 5);
        
        // System.out.println(allMatch);

        boolean anyMatch = people.stream().anyMatch(p -> p.getAge() > 50);

        // System.out.println(anyMatch);

        Optional minAge = people.stream()
            .min(Comparator.comparing(per -> per.getAge()));

        System.out.println(minAge);

    }

    private static List<Person> getPeople() {
        return List.of(
            new Person("Antonio", 20, Mood.HAPPY),
            new Person("Alina Smith", 33, Mood.SLEEPY),
            new Person("Helen White", 57, Mood.SCARED),
            new Person("Alex Boz", 14, Mood.SAD),
            new Person("Jamie Goa", 99, Mood.HAPPY),
            new Person("Anna Cook", 7, Mood.ANGRY),
            new Person("Zelda Brown", 120, Mood.HAPPY)
        );
    }

    static void printThing(Printable thing) {
        thing.print("The Catcher in the Rye");
    }
}
