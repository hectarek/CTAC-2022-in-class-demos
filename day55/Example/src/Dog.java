public class Dog {
    
    private String name;
    private int id;
    private boolean isPureBred;

    public Dog(){}

    public Dog(String name, int id, boolean isPureBred) {
        this.name = name;
        this.id = id;
        this.isPureBred = isPureBred;
    }

    @Override
    public String toString() {
        return "Dog [id=" + this.id + ", isPureBred=" + this.isPureBred + ", name=" + this.name + "]";
    }

}
