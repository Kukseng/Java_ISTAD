package ISTAD_Lesson.Loop;
public class LabelCon {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i == j) {
                    continue outer;
                }
            }
        }
    }
}