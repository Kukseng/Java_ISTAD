package ISTAD_Lesson;

import java.util.Scanner;

public class CinemaHall {
    public static void main(String[] args) {
        String[][] bookingHistory = new String[100][3];
        int historyIndex = 0;
        Scanner user = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows =user.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = user.nextInt();
        String[][] seats = new String[rows][columns];
        char rowLabel = 'A';
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                seats[i][j] = rowLabel + "" + (j + 1) + ": AV";
            }
            rowLabel++;
        }
        System.out.println("Cinema hall setup complete!");

        int option;
        do {
            System.out.println("\nCinema Booking:");
            System.out.println("1. Add Booking");
            System.out.println("2. Cancel Booking");
            System.out.println("3. Display Cinema");
            System.out.println("4. View Booking History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice 1-5: ");

            option = user.nextInt();
            switch (option) {
                case 1: {
                    System.out.print("Enter row number (0 - " + (rows - 1) + "): ");
                    int bookingRows = user.nextInt();
                    System.out.print("Enter column number (0 - " + (columns - 1) + "): ");
                    int bookingCols = user.nextInt();

                    if (seats[bookingRows][bookingCols].endsWith("AV")) {
                        seats[bookingRows][bookingCols] = seats[bookingRows][bookingCols].replace("AV", "BO");
                        if (historyIndex < bookingHistory.length) {
                            bookingHistory[historyIndex][0] = seats[bookingRows][bookingCols];
                            bookingHistory[historyIndex][1] = "Booked";
                            bookingHistory[historyIndex][2] = String.valueOf(historyIndex + 1);
                            historyIndex++;
                        }
                        System.out.println("Successfully booked seat: " + seats[bookingRows][bookingCols]);
                    } else {
                        System.out.println("Booking seat already exists!");
                    }
                    break;
                }
                case 2: {
                    System.out.print("Enter row number to cancel (0 - " + (rows - 1) + "): ");
                    int cancelRows = user.nextInt();
                    System.out.print("Enter column number to cancel (0 - " + (columns - 1) + "): ");
                    int cancelCols = user.nextInt();

                    if (seats[cancelRows][cancelCols].endsWith("BO")) {
                        seats[cancelRows][cancelCols] = seats[cancelRows][cancelCols].replace("BO", "AV");
                        System.out.println("Successfully canceled seat: " + seats[cancelRows][cancelCols]);
                    } else {
                        System.out.println("No booking found for this seat!");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Cinema Hall Booking Display:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < columns; j++) {
                            System.out.print(seats[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                }
                case 4: {
                    System.out.println("Booking History:");
                    if (historyIndex == 0) {
                        System.out.println("No bookings found.");
                    } else {
                        for (int i = 0; i < historyIndex; i++) {
                            System.out.println("Seat: " + bookingHistory[i][0] + ", Status: " + bookingHistory[i][1] +
                                    ", Booking ID: " + bookingHistory[i][2]);
                        }
                    }
                    break;
                }
            }
        } while (option != 5);
        System.out.println("Thank you for using Cinema Booking!");
    }
}