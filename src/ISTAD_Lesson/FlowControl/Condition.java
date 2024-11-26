package ISTAD_Lesson.FlowControl;
public class Condition {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Condition condition");
            System.out.println(args.length);

        }
        int ages = 34;

        if (18 <= ages) {
            System.out.println("You are older than 18 years old");
        } else {
            System.out.println("You are older than 18 years old");
        }
        String Person = (ages< 18) ? ("You are older than 18 years old") : ("You are older than 18 years old");
        System.out.println(Person);
    }
}