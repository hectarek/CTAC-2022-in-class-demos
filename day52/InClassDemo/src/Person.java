public class Person {
    
    public String name;
    private int age;
    public String occupation;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.occupation = "Unemployed";
    }

    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public void talk() {
        System.out.println("Hey, my name is " + this.name);
    }

    public void talk(String response) {
        System.out.println("Name is " + this.name + " nice to meet you " + response);
    }

    public void howOldAmI() {
        System.out.println("I am " + this.age + " years old.");
    }

}
