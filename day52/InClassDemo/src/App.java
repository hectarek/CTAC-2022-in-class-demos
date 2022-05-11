public class App {
    public static void main(String[] args) throws Exception {
       
        // Person sally = new Person("Sally", 12);

        // sally.talk();
        // sally.howOldAmI();

        // Mother theresa = new Mother("Theresa", 89);
        // theresa.talk();
        // theresa.talk("Naveen");

        // Father gio = new Father("Giovanni", 45);
        // gio.talk();
        // gio.talk("Maria");

        // Person pers = gio;
        // pers.talk();
        // pers.talk("Georgio");

        // Person person1 = new Person("Goofy", 87);
        // Person person2 = new Person("Donald", 79, "Sailor");

        // Person peep[] = {person1, person2};

        // peep[0].talk();
        // peep[1].talk();

        Mother nancy = new Mother("Nancy", 39, true);

        nancy.name = "Snancy"; // happened somewhere else...
        
        System.out.println(nancy.name);
        // System.out.println(nancy.isMarried);
        
        // nancy.isMarried;

        Balance bank = new Balance(100_000);

        // bank.accountBalance = 1_000_000;

        System.out.println(bank);
        bank.setBalance(100_500);

    }
}
