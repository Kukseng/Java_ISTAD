package ISTAD_Lesson.ArrayList;

import java.util.ArrayList;

public class arrAssign {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Original ArrayList: " + colors);
// Update element at index 1
        colors.set(1, "Yellow");
        System.out.println("Updated ArrayList: " + colors);
    }
}





