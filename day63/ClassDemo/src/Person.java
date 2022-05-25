public class Person {

    private String name;
    private int age;
    private Mood mood;
  
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