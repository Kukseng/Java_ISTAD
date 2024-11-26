//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        outer:
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 3; j++) {
//                System.out.println("i: " + i + ", j: " + j);
//                if (i == 2 && j == 2) {
//                    break outer; // Exits the outer loop
//                }
//            }
//        }
//        System.out.println("Exited the outer loop.");

//            for(int i=1;i<=10;i++){
//                if(i==5){
//                    break;
//                }
//                System.out.println(i);
//
//            }

//        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break;                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
        System.out.println("Completed all iterations.");
    }

}
