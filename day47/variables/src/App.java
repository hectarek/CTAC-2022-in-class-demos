// public class App {
//     public static void main(String[] args) {
//         // LOCAL VARIABLE
//         String name = "Tim Allen";
//         System.out.println(name);

//         int someNumber = 4;
//         System.out.println(someNumber);

//         boolean isTrue = true;
//         System.out.println(isTrue);

//         byte anotherNum = 12;
//         System.out.println(anotherNum);

//         Integer aNum = 238;
//         System.out.println(aNum);
//     }
   
// }


// class App {

//     public String teacher; // Declared Instance Variable
//     public int age;

//     public App() { // Default Constructor
//         this.teacher = "Hector G."; // initializing Instance Variable
//         this.age = 39;
//     }

//     // Main Method
//     public static void main(String[] args) {

//         // Object Creation
//         App name = new App();
//         // Displaying O/P
//         System.out.println("Teacher name is: " + name.teacher);
//         System.out.println("Teachers age is: " + name.age);

//     }
// }

// class App {
   
//     public static String teacher = "Hector G.";   //Declared static variable
     
//       public static void main (String[] args) {
          
//         //teacher variable can be accessed withod object creation
//         //Displaying O/P

//         //App.teacher --> using the static variable
//           System.out.println("Teacher Name is : " + App.teacher);
//       }
//   }


// Java program to read data of various types using Scanner class.
// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) {
//         // Declare the object and initialize with
//         // predefined standard input object
//         Scanner sc = new Scanner(System.in);

//         // String input
//         String name = sc.nextLine();

//         // Character input
//         char gender = sc.next().charAt(0);

//         // Numerical data input
//         // byte, short and float can be read
//         // using similar-named functions.
//         int age = sc.nextInt();
//         long mobileNo = sc.nextLong();
//         double cgpa = sc.nextDouble();

//         // Print the values to check if the input was correctly obtained.
//         System.out.println("Name: " + name);
//         System.out.println("Gender: " + gender);
//         System.out.println("Age: " + age);
//         System.out.println("Mobile Number: " + mobileNo);
//         System.out.println("CGPA: " + cgpa);
//     }
// }

// import java.util.Scanner;

// public class App {
//     public static void main(String[] arg) {

//         Scanner scan = new Scanner(System.in);

//         System.out.println("Hey, give input please");

//         String txt = scan.nextLine();

//         System.out.println("Hey, give a number please");

//         int num = Integer.valueOf(scan.nextLine());

//         boolean value = Boolean.valueOf(scan.nextLine());

//         System.out.println("User input: " + txt);
//         System.out.println("User Number: " + num);
//         System.out.println("User Boolean: " + value); 
//      }
// }

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       // Create the scanner for reading user input
        Scanner scanner = new Scanner(System.in);
        
        //Print "Provide text for the Scanner to read: "

        System.out.println("Give me your dumb name: ");

        String text = scanner.nextLine();

        System.out.println("Would you like to go on an adventure " + text + "?");

        String answer = scanner.nextLine();
        System.out.println(answer);
        if (answer.equals("yes")) {
            System.out.println("Sweet");
        } else {
            System.out.println("well fuck off then");
        }
        scanner.close();

    }
    
}