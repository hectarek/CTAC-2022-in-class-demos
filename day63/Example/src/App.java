import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        while(true){
            String row = scanner.nextLine();
            if(row.equals("no")){
                break;
            }
            inputs.add(row);
        }
        long numbersDivisibleByThree = inputs.stream()
                .mapToInt(Integer::valueOf)
                .filter(number -> number % 3 == 0)
                .count();

        double average = inputs.stream()
                .mapToInt(Integer::valueOf)
                .average()
                .getAsDouble();

        System.out.println(numbersDivisibleByThree);
        System.out.println(average);
    }

}
