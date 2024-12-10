package ISTAD_Lesson;

import java.util.Scanner;

public class CondoRent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number f rows condo");
        int rows = sc.nextInt();
        System.out.println("Enter the number f columns condo");
        int cols = sc.nextInt();
        String[][] condo = new String[rows][cols];
        for ( int i=0; i<rows; i++){
            for (int j=0;j<cols ; j++){
                condo[i][j]=null;
            }

        }
        int option;
        System.out.println("Setup Condo successfully");

        do {

            System.out.println("**Condo**");
            System.out.println("1. Buy Condo");
            System.out.println("2. Sell Condo");
            System.out.println("3. Cancel Buy Condo");
            System.out.println("4. Exist");
            System.out.println("Choose an option: ");
             option = sc.nextInt();
            switch (option){
                case 1 ->{
                    System.out.println("Enter the numbers of rows ( 0"+(rows-1)+")");
                    int condoRows = sc.nextInt();
                    System.out.println("Enter the numbers of columns ( 0"+(cols-1)+")");
                    int condoCols = sc.nextInt();
                    if (condo[condoRows][condoRows]==null){
                        condo[condoRows][condoRows]="Buy";
                    }
                }
                case 2 ->{
                    System.out.println("f");
                }
                case 3 ->{
                    System.out.println("Display Status Condo");
                   for (int i=0; i<rows; i++){
                       for (int j=0; j<cols; j++){
                           String condoStauts =(condo[i][j]==null)?"Null":"Has owner";
                           System.out.println(condoStauts+ "\t");
                       }
                   }
                }

            }
        }while(option !=4);


    }
}
