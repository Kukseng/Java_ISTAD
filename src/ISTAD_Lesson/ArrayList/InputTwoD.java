package ISTAD_Lesson.ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class InputTwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++){
            for(int j =0; j<cols; j++){
                int index = ++i;

                System.out.println("Enter the "+(index)+"th element: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("List of elemnts: ");
        System.out.println(Arrays.deepToString(arr));


    }
}
