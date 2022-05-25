public class Person {

    private final String name;
    private final int age;
    private final Mood mood;
  
    public Person(String name, int age, Mood mood) {
      this.name = name;
      this.age = age;
      this.mood = mood;
    }
  
    public String getName() {
      return name;
    }
  
    public int getAge() {
      return age;
    }
  
    public Mood getMood() {
      return mood;
    }
  
    @Override
    public String toString() {
      return "Person{" +
          "name='" + name + '\'' +
          ", age=" + age +
          ", mood=" + mood +
          '}';
    }
  }