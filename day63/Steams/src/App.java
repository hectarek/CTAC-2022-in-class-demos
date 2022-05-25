import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class App {

  public static void main(String[] args) {


    DaysOfTheWeek day = DaysOfTheWeek.FRIDAY;

    DaysOfTheWeek.values();

    if (day ==  DaysOfTheWeek.FRIDAY) {
        System.out.println("Friday, friday, gotta get down on friday");
    }

    for (DaysOfTheWeek days : DaysOfTheWeek.values()) {
        System.out.println(days);
    }

    Book myBook = new Book();
    myBook.print();
    // OR
    printThing(myBook);

    // write printThing method below

    // Lambdas allow you to use the implementation instead

    // printThing( 
    //      public void print() {
    //          System.out.println("This is a book");
    //      }
    // ) 

    printThing(() -> System.out.println("my book")); 

    // OR You can make it a variable

    Printable lambdaPrintable = () -> System.out.println("my book");

    printThing(lambdaPrintable);
    

    List<Person> people = getPeople();

    // void print(boook title)


    // Streams

    // Imperative approach

    /*
    List<Person> moods = new ArrayList<>();
    for (Person person : people) {
      if (person.getMood().equals(Mood.HAPPY)) {
        moods.add(person);
      }
    }
    moods.forEach(System.out::println);
    */

    // Declarative approach

    // Filter
    List<Person> moods = people.stream()
        .filter(person -> person.getMood().equals(Mood.HAPPY))
        .collect(Collectors.toList());

//    moods.forEach(System.out::println);

    // Sort
    // List<Person> sorted = people.stream()
    //     .sorted(Comparator.comparing(p -> ((Person) p).getAge()).thenComparing(p -> ((Person) p).getMood()).reversed())
    //     .collect(Collectors.toList());

//    sorted.forEach(System.out::println);

    // All match
    boolean allMatch = people.stream()
        .allMatch(person -> person.getAge() > 8);

//    System.out.println(allMatch);
    // Any match
    boolean anyMatch = people.stream()
        .anyMatch(person -> person.getAge() > 121);

//    System.out.println(anyMatch);
    // None match
    boolean noneMatch = people.stream()
        .noneMatch(person -> person.getName().equals("Antonio"));

//    System.out.println(noneMatch);

    // Max
    people.stream()
        .max(Comparator.comparing(p -> ((Person) p).getAge()));
//        .ifPresent(System.out::println);

    // Min
    people.stream()
        .min(Comparator.comparing(p -> ((Person) p).getAge()));
//        .ifPresent(System.out::println);

    // Group
    Map<Mood, List<Person>> groupByMood = people.stream()
        .collect(Collectors.groupingBy(p -> ((Person) p).getMood()));

//    groupByMood.forEach((gender, people1) -> {
//      System.out.println(gender);
//      people1.forEach(System.out::println);
//      System.out.println();
//    });

    Optional<String> oldestFemaleAge = people.stream()
        .filter(person -> person.getMood().equals(Mood.HAPPY))
        .max(Comparator.comparing(Person::getAge))
        .map(Person::getName);

    oldestFemaleAge.ifPresent(System.out::println);
  }

  static void printThing(Printable thing) {
      thing.print();
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

}