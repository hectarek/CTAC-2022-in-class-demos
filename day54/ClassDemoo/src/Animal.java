public class Animal {
    
    private String name;
    private boolean isDog;

    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDog() {
        return isDog;
    }

    public void setDog(boolean isDog) {
        this.isDog = isDog;
    }

    public String toString() {
        return "Animal [isDog=" + isDog() + ", name=" + getName() + "]";
    }

}
