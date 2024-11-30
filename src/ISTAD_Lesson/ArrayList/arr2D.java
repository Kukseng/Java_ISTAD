package ISTAD_Lesson.ArrayList;

public class arr2D {
    public static void main(String[] args) {

        // Creating a 2D array with 3 rows and 4 columns  // Assigning values to the 2D array
        int[][] listArr = new int[2][3];
        listArr[0][0] = 1;
        listArr[0][1] = 2;
        listArr[0][2] = 3;


        listArr[1][0] = 5;
        listArr[1][1] = 6;
        listArr[1][2] = 7;


        // Printing the entire 2D array
        System.out.println("Displaying the 2D array:");

        for (int i = 0; i < listArr.length; i++) {
            for (int j = 0; j < listArr[i].length; j++) {
                System.out.print(listArr[i][j] + " ");
            }
            System.out.println();
        }

        // Accessing a specific element in the 2D array
//        System.out.println("\nElement at row 1, column 2: " + listArr[1][2]); // Output: 7
        String[] fruits = {"Apple", "Banana", "Cherry"};
        System.out.println("Original Array: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        // Step 2: Update an element in the array
        fruits[1] = "+++"; // Replacing "Banana" with "Blueberry"
        System.out.println("Updated Array: ");
        for (String fruit : fruits) {
            System.out.println(fruit + " ");
        }
        System.out.println();


    }
}



