public class Father extends Person {

    public Father(String name, int age) {
        super(name, age);
    }
    
    public void talk() {
        System.out.println("I am a father, and I am " + this.name);
    }
}
