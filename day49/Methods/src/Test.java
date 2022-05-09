// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {

        // // LOGICAL OPERATORS
        // System.out.println("Is the number between 15 AND 20 or greater than 12 OR not
        // equal to 15: ");

        // int number = 20;

        // if (number == 20) {
        //     System.out.println("It is the number 20!");
        // } else {
        //     System.out.println("It is not 20!");
        // }

        // CLEAN CODE CONSIDERATIONS
        // int income = 90_000;
        // if (income > 60_000) {
        // boolean isAboveAverageIncome = true;
        // } else {
        // boolean isAboveAverageIncome = false;
        // }

        // System.out.println(isAboveAverageIncome);

        // into
        // int income = 90_000;
        // boolean isAboveAverageIncome = false;

        // if (income > 60_000)
        // isAboveAverageIncome = true;

        // System.out.println(isAboveAverageIncome);

        // // TERNARY OPERATORS
        // int a = 2;
        // int b = 5;
        // int min = (a < b) ? a : b;

        // System.out.println(min);

        // int x, y;

        // x = 20;
        // y = (x == 1) ? 61 : 90;
        // System.out.println("Value of y is: " + y);

        // y = (x == 20) ? 61 : 90;
        // System.out.println("Value of y is: " + y);

        // // SWITCH STATEMENT

        // int num = 20;

        // switch (num) {
        // case 10:
        // System.out.println("10");
        // break;
        // case 20:
        // System.out.println("20");
        // break;
        // case 30:
        // System.out.println("30");
        // break;
        // default:
        // System.out.println("Not in 10, 20 or 30");
        // }

        // // FOR LOOPS
        // for (int i = 0; i < 5; i++) {
        // System.out.println(i);
        // }

        // // WHILE LOOPS
        // int i = 0; // 1
        // while (i < 5) { // 2
        // System.out.println(i); // 3
        // i++;
        // }

        // while (true) { // DONT RUN
        // System.out.println("I can program!");
        // }

        // Break
        // Scanner scanner = new Scanner(System.in);

        // while (true) {
        // System.out.println("Do you want to leave? (if yes, enter 'y')");
        // String userInput = scanner.nextLine();
        // if (userInput.equals("y")) {
        // break;
        // }

        // System.out.println("Thanks for staying!");
        // }

        // System.out.println("See ya later!");

        // Continue
        // for (int i = 1; i <= 3; i++) {
        // for (int j = 1; j <= 3; j++) {
        // if (i == 2 && j == 2) {
        // continue;
        // }
        // System.out.println(i + " " + j);
        // }
        // }

        // Assign Function to Variable
        // int num = returnThree();

        // System.out.println("Method returns the number " + num);


        // byte b1 = 100, b2 = 29;
		// byte b3 = (byte) (b1+b2);		
		// System.out.println(b3);

//         boolean a = true, b = false;
		
// 		if(a && !b) System.out.println("true");
// 		else System.out.println("false");
		
//     }

//     // METHODS

//     public static void hello() {
//         System.out.println("Hello!");
//     }

//     // PARAMETERS
//     public static void hello(int number) {
//         int i = 0;
//         while (i < number) {
//             System.out.println("Hello!");
//             i++;
//         }
//     }

//     public static void sum(int numOne, int numTwo) {
//         System.out.println("" + numOne + " + " + numTwo + " = " + (numOne + numTwo));
//     }

//     public static int returnThree() {
//         return 3;
//     }

//     public static double averageOfNums(int num1, int num2, int num3) {
//         int sum = num1 + num2 + num3;
//         double average = sum / 3.0;

//         return average;
//     }
// }

public class Test{
	
	int i;
	void print(){
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		new Test().print();
	}
}