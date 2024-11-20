package ISTAD_Lesson;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String username = sc.next();
        System.out.println("Enter the Password: ");
        String password = sc.next();
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

    }
}
