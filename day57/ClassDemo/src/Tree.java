import java.util.ArrayList;

public class Tree {

    private String name;
    private int age;

    public Tree(String name) {
        this.name = name;
    }

    public Tree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



}
