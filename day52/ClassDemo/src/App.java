public class App {
    public static void main(String[] args) throws Exception {
        
        // Pillars of OOP

        Person jose = new Person("Jose", 15);

        // ABSTRACTION
        Person person = new Person("Tom", 42);

        // person.talk();

        MainService mail = new MainService();

        mail.sendEmail();

        // INHERITANCE
        Mother mom = new Mother("Theresa", 36);

        // mom.talk();

        // POLYMORPHISM
        Father dad = new Father("Giovanni", 41);

        Person per = dad;
        per.talk();
        per.talk("Isabella");

        Person[] peep = {mom, dad};

        // peep[0].talk();
        // peep[1].talk();

        Person person1 = new Person("Jerry");
        Person person2 = new Person("Oscar", 35);

        // ENCAPSULATION

        mom.occupation = "Engineer";
        dad.occupation = "Botanist";

        // Directly able to set properties
        // mom.isMarried; // Unable to get private variable

        // Instead, use setters and getters

        mom.setIsMarried(false);
        mom.getIsMarried();

        // Allows you to choose what you set or get

    }


}


