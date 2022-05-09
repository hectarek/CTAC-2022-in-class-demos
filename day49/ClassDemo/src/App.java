import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double avg=averageNums(6, 9, 27);

        System.out.println(avg);

    }

    public static void saySomething() {
        System.out.print("Hello, There!");
    }

    public static void sayNumber(int num) {
        System.out.println(" My Number is: " + num);
    }

    public static void saySumthing(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(" My Number is: " + sum);
    }

    public static int returnThree() {
        return 3;
    }

    public static double averageNums(int x, int y, int z) {
        int sum = x + y + z;
        double avg = sum / 3;
        return avg;
    }

}
