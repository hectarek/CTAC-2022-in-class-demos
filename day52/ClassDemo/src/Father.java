public class Father extends Person {
    
    public int childrenAmount;
    private boolean isMarried;
    public Person significantOther;

    public Father(String name, int age) {
        super(name, age);
    }

    public void talk() {
        System.out.println("I am a father and my name is " + this.name);
    }

    // public void talk(String res) {
    //     System.out.println("I am a father and my name is " + this.name + " , nice to meet you " + res);
    // }

    public boolean getIsMarried() {
        return this.isMarried;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

}
