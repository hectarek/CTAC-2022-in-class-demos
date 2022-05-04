package com.classdemo;

//public class Main {
//    public static void main(String[] args) {
//
//        byte num = 10;
//        System.out.println("The byte value: " + num);
//
//        // convert into double type
//        int data = num;
//        System.out.println("The int value: " + data);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        // EXPLICIT TYPE CASTING
//        // create double type variable
//        double num1 = 16.539;
//        System.out.println("The double value: " + num1);
//
//        // convert into int type
//        int data1 = (int)num1;
//        System.out.println("The integer value: " + data1);

//        // USING METHODS
//        // INT TO STRING
//        int num2 = 10;
//        System.out.println("The integer value is: " + num2);
//
//        // converts int to string type
//        String data2 = String.valueOf(num2);
//        System.out.println("The string value is: " + data2);
//
//        // STRING TO INT
        // create string type variable
//        String data3 = "10 example";
//        System.out.println("The string value is: " + data3);
//
//        // convert string variable to int
//        int num3 = Integer.parseInt(data3);
//        System.out.println("The integer value is: " + num3);
//
//        // Special case of floats
//        float num4 = 10.24F;
//        double num6 = 10.24;
//        double num5 = (double)num4;
//
//        System.out.println(num5);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        // OPERATORS
//        // Adding ints
//        int result = 10 + 3;
//        System.out.println(result);
//
//        // dividing ints
//        int results2 = 10 / 3;
//        System.out.println(results2);

//        // making it a double??
//        double results3 = (double)10 / (double)3;
//        // or
//        double results4 = 10.0 / 3.0;
//        System.out.println(results4);

//        // incrementing our ints
//        int x = 1;
//        x++;
//        System.out.println(x);

//        // can also prefix
//        int x = 1;
//        ++x;
//        System.out.println(x);

//        // however, java is very specific
//        int x = 1;
//        int y = x++; // aka unary operators
//        System.out.println("x: " + x);
//        System.out.println("y: " + y);

//        int x = 3;
//        x -= 2;
//        System.out.println(x); // 1
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {

//        int num = 21;
//        if (num > 9) {
//            System.out.println("Num is greater than 9");
//        }
//        // If else statements
//        int number = 30;
//        if (number == 10) {
//            System.out.println("The number is ten");
//        } else if (number == 20) {
//            System.out.println("The number is twenty");
//        } else if (number == 30) {
//            System.out.println("The number is thirty!");
//            // execution will stop here and print The number is thirty
//        } else {
//            System.out.println("The number is not ten, twenty or thirty!");
//        }

//        String word = "Tree";
//        String happy = "happy";
//        String glad = "happy";
//
//        if (happy.equals(glad)) {
//            System.out.println("The strings were the same!");
//            // this statement will be executed
//        } else {
//            System.out.println("The strings were different!");
//        }

//        String s1 = new String("This String");
//        String s2 = new String("This String");
//
//        if (s1 == s2) {
//            System.out.println("The strings were the same!");
//        } else {
//            System.out.println("The strings were different!");
//            // this statement will be executed
//        }
//
//        // use equals()
//        String s1 = new String("This String");
//        String s2 = new String("This String");
//
//        if (s1.equals(s2)) {
//            System.out.println("The strings were the same!");
//            // this statement will be executed
//        } else {
//            System.out.println("The strings were different!");
//        }
//    }
//}