package ISTAD_Lesson.ReturnTypes;

public class ReturnTypes {
//    static  void Parameter(String name, int... list){
//        System.out.println(name);
//    }
    public void inputVagars(int... numbers) {
        for (int number : numbers){
            System.out.println(number);
        }

    }
//    public    int getNumber() {
//        return 42;
//    }
    public static void main(String[] args) {
//        ReturnTypes num = new ReturnTypes();
//        int number = num.getNumber();
//        System.out.println(number);
//        Parameter("test");
        ReturnTypes rt = new ReturnTypes();
        rt.inputVagars(5,4,3,5,2);
    }
}

