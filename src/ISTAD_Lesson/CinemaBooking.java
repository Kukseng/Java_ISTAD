package ISTAD_Lesson;
import java.util.ArrayList;
import java.util.Scanner;

public class CinemaBooking {
    public static void main(String[] args) {
        ArrayList<String> bookingHistory = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Set up seat :");
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of column: ");
        int cols = sc.nextInt();
        String[][] arr = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = null;
            }
        }
        System.out.println("Cinema hall setup complete!");
        int option;
        do {
            System.out.println("Cinema Booking: ");
            System.out.println("1. Add Booking ");
            System.out.println("2. Cancel Booking");
            System.out.println("3. Display Cinema");
            System.out.println("4. Exit");
            System.out.println("Enter your choice 1-5: ");

            option = sc.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.println("Enter rows of the number(0 - "+ (rows-1) +"): ");
                    int bookingRows = sc.nextInt();
                    System.out.println("Enter columns of the number(0 - "+ (cols-1) +"): ");
                    int bookingCols = sc.nextInt();
                    String numberSeats = "Rows Seat: " + bookingRows + "Column Seat: " + bookingCols;
                    if (arr[bookingRows][bookingCols] == null) {
                        arr[bookingRows][bookingCols] = "BO";
                        bookingHistory.add("Seat: " + numberSeats);
                        System.out.println("Success book seat: " + numberSeats);
                    }else {
                        System.out.println("Booking seat already exists! " );
                    }
                }
                case 2 -> {
                    System.out.println("Enter rows of the number cancel(0 - "+ (rows-1) +"): ");
                    int cancelRows = sc.nextInt();
                    System.out.println("Enter columns of the number cancel(0 - "+ (cols-1) +"): ");
                    int cancelCols = sc.nextInt();
                    if("BO".equals(arr[cancelRows][cancelCols])) {
                        arr[cancelRows][cancelCols]=null;
                        System.out.println("Success cancel seat: " + cancelCols);
                    }else {
                        System.out.println("Cancel seat not booking! " );
                    }
                }
                case 3 ->{
                    System.out.println("Cinema Hall Booking Display:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            String seatStatus = (arr[i][j] == null) ? "A" + i + j : "BO";
                            System.out.print(seatStatus + "\t");
                        }
                        System.out.println();
                    }
                }
            }
        } while (option != 4);
        System.out.println("Thank you for using Cinema Booking!");
    }
}
