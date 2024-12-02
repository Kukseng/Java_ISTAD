package ISTAD_Lesson.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class arrInitialize {
    public static void main(String[] args) {
//        ArrayList <Integer> arr = new ArrayList<>(Arrays.asList(2,3,1));
//        arr.add(5);
//        System.out.println(arr);
//        int[] arr = {1, 2, 3, 4, 5};
//        int indexToRemove = 2; // Remove the element at index 2 (value 3)
//        int[] newArr = new int[arr.length - 1];
//        for (int i = 0, j = 0; i < arr.length; i++) {
//            if (i != indexToRemove) {
//                newArr[j++] = arr[i];
//            }
//        }
//        System.out.println("Original Array: " + Arrays.toString(arr));
//        System.out.println("Array After Removal:" + Arrays.toString(newArr));
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Apple");
//        list.add("Banana");
//        list.add("Cherry");
//        // Remove by value
//        list.remove("Banana");
//        // Remove by index
//        list.remove(0); // Removes "Apple"
//        System.out.println("Updated List: " + list);
//        int[][] numbers = {
//                {1, 2, 3},
//                {5, 6, 7},
//                {8, 8, 9}
//        };
//        for (int[] row : numbers) {
//            for (int element : row) {
//                System.out.print(element+" ");
//            }
//            System.out.println();
//        }
//        ArrayList<Integer> nums = new ArrayList<>();
//        nums.add(5);
//        nums.add(29);
//        nums.add(43);
//        nums.remove(2);
//        System.out.println(nums);
//        nums.clear(); // clear all the elements in array
//        System.out.println(nums);
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Alice");
//        names.add("Bob");
//        names.add("Charlie");
//
//        // Use .size() to get the number of elements
//        System.out.println("List size: " + names.size()); // Output: 3
//
//        // Loop through the list using its size
//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i)); // Output: Alice, Bob, Charlie
//        }
//        ArrayList<String> colors = new ArrayList<>();
//        colors.add("Red");
//        colors.add("Green");
//        colors.add("Blue");
//        System.out.println("Original:" + colors);
//// Update element at index 1
//        colors.set(1, "Yellow");
//        System.out.println("Updated: " + colors);
//        int[] arr1 = {10, 20, 30, 40,};
//
//        System.out.println("Copied Array: " + arr1);
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i]+ ", ");
//        }
//        for(int i : arr1){
//            System.out.println(i);
//        }
        int[] numbers = {1, 3, 5, 8, 9};
        int key = 7;	// Perform binary search
int result = Arrays.binarySearch(numbers, key);
        if (result >= 0) {
            System.out.println("Element " + key + " found at index: " + result);
        } else {
            System.out.println("Element " + key + " not found.Insertion point: " + (-(-result+1)));
        }



    }
}

