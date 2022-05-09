import java.util.ArrayList;

public class App {
    // DEBUGGING IN JAVA
//    public static void main(String[] args) {
//        a();
//    }
//    static void a() {
//        b();
//    }
//    static void b() {
//        c();
//    }
//    static void c() {
//        d();
//    }
//    static void d() {
//        Thread.dumpStack();
//    }

    // ARRAYLISTS
    public static void main(String[] args) {
//        ArrayList list = new ArrayList<>();
//        list.add(11);
//        list.add(58.92);
//        list.add(false);
//        list.add("Strings are reference type variables");

//        ArrayList<Integer> list5 = new ArrayList<>();
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        System.out.println(list.size());
//
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(22);
        numbers.add(33);
        numbers.add(44);
        numbers.add(55);

//
//        // Enhanced For Loop
//        for (double number : numbers) {
//            System.out.println(number);
//            System.out.println("Next Number");
//        }
//
        // ARRAY METHODS

        //
//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(1);
//        list.add(22);
//        list.add(59);
//        list.add(58);
//        list.add(90);
//
//        list.remove(1); // removes the list value of 22 (index value of 1)
//        list.remove(Integer.valueOf(59)); // removes the list value of 59 (index value of 2)
//        list.set(0, 34); // sets index of 0 to value of 34
//
//        for (int item: list) {
//            System.out.println(item);
//        }
//        System.out.println("size: " + list.size());
//        System.out.println(list.contains(58));
//        System.out.println(list.contains(59));
//
//        System.out.println("Index 0 so the first value: " + list.get(0));
//        System.out.println("Index 1 so the second value: " + list.get(1));
//        System.out.println("Index 1 so the second value: " + list.get(2));

        // ARRAYS
//        int intArray[]; // OR
//        int[] intArrays;

//        int intArray[] = new int[5];
//
//        byte byteArray[];
//        short shortsArray[];
//        boolean booleanArray[];
//        long longArray[];
//        float floatArray[];
//        double doubleArray[];
//        char charArray[];
//
//        int[] nums = new int[5];
//        nums[0] = 1;
//        nums[1] = 22;
//        nums[2] = 59;
//        nums[3] = 58;
//        nums[4] = 90;
//
//        for (int num : nums) {
//            System.out.println(num);
//        }
//        System.out.println(nums.length);
//
//
//        int[] numbers = new int[4];
//        numbers[0] = 1;
//        numbers[1] = 22;
//        numbers[2] = 59;
//        numbers[3] = 58;
//
//        System.out.println("There are " + numbers.length + " elements in the array.");
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

        int[] numberss = {11, 54, 41};
        String[] strings = {"Jane", "John", "Jill"};
        double[] numsWithDecimals = {2.11, 3.14, 68.34, 0.398348};

        for (int num : numberss) {
            System.out.println(num);
        }
        System.out.println(numberss.length);
    }
}

