public class Mother extends Person {

    public int childrenAmount;
    private boolean isMarried;
    public Person significantOther;

    public Mother(String name, int age) {
        super(name, age);
    }

    public void talk() {
        System.out.println("I am a mother and my name is " + this.name);
    }

    public boolean getIsMarried() {
        return this.isMarried;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }
    
    
}
