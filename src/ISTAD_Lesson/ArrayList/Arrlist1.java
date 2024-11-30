package ISTAD_Lesson.ArrayList;

import java.util.ArrayList;

public class Arrlist1 {
    public static void main(String[] args) {
        // ArrayList Example
//        ArrayList<Integer> myArr = new ArrayList<>();
//        myArr.add(1);
//        myArr.add(2);
//        myArr.add(3);
//
//        // Searching if the number '2' exists in the ArrayList
//        if (myArr.contains(2)) {
//            System.out.println("Number is in the list");
//        } else {
//            System.out.println("Number isn't in the list");
//        }

        // 2D Array Example
        String[][] names = {
                {"Alice", "Bob", "Charlie", "David"},
                {"Eve", "Frank", "Grace", "Hannah"},
                {"Ivy", "Jack", "Kathy", "Leo"}
        };

        // Printing the 2D array
        System.out.println("\nDisplaying names in the 2D array:");
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j] + " ");
            }
            System.out.println();  // New line after each row
        }
    }
}
