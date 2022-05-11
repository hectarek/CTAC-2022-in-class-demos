public class Person {

    private String name;
    private int age;
    private double weight; // kg
    private double height; // cm


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Person(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void growOlder() {
        this.age += 1;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void growOlder(int years) {
        this.age += years;
    }

    public int growOlder(double years) {
        this.age += years;
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double bodyMassIndex() {
        if (this.weight == 0 || this.height == 0) {
            System.out.println("Please define height/weight for " + this.name);
            return 0.0;
        } else {
            double heightDivByHundred = this.height / 100.0;
            // BMI = Weight (kg) / (Height (m))^2
            return Math.round((this.weight / (heightDivByHundred * heightDivByHundred)) * 100.0) / 100.0;
        }
    }

    public String toString() {
        return "Name: " + this.name + " age: " + this.age + " weight: " + this.weight + "kg, height: " + this.height + "cm";
    }
}
