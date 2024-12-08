package ISTAD_Lesson.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class JavaOned {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of student : ");
        n = scanner.nextInt();


        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }


        System.out.println("All Scores: ");
        System.out.println(Arrays.toString(scores));
        System.out.println("All even scores: ");
        for (int num : scores) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\nAll odd scores: ");

        for (int num : scores) {
            if (num % 2 == 0) continue;
            System.out.print(num + " ");
        }
//        find average
        int sum =0;
        for (int num : scores) {
            sum += num;
        }
        System.out.println("average");
        System.out.println(sum + " ");

        System.out.println("\nFind max number: ");
        int max = scores[0];
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
                System.out.println(max + " ");
            }else if (scores[i]<min){
                min = scores[i];
                System.out.println("\nFind min number: ");
                System.out.println(min +" ");
            }
        }


    }
}
