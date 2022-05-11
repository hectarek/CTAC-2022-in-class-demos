public class Person {
    
    public String name;
    private int age;
    public String occupation;
    
    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.occupation = "Unemployed";
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.occupation = "Unemployed";
    }

    public void talk() {
        System.out.println("Hello! My name is " + this.name);
    }

    public void talk(String res) {
        System.out.println("Hello! My name is " + this.name + " , nice to meet you " + res);
    }

    public void howOldAmI() {
        System.out.println("I am " + this.age + " years old.");
    }
}

