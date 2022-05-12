public class Dog extends Animal {

    public String type;

    public Dog(String name, String type, boolean isDog) {
        super(name, isDog);
        isDog = true;
        this.type = type;
    }

    public Dog(String name, boolean isDog) {
        super(name, isDog);
    }

}

