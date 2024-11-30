package ISTAD_Lesson.ArrayList;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(10);
//        myNumbers.add(15);
//        myNumbers.add(20);
//        myNumbers.add(25);
//
//        for (int i : myNumbers) {
//            System.out.println(i);
//
//        }

//        //Sorting element  by index;
//            myNumbers.size();
//        System.out.println(myNumbers);
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Sheep");
//        for (String animal : animals) {
//            System.out.println(animal.toUpperCase());
//
//        }
        //Access ArrayList element method get element by index
//        String animalNames = animals.get(1);
//        System.out.println(animalNames.toUpperCase());

        //Change ArrayList element
//        animals.set(2, "Parrot");
//        for (String animal : animals) {
//            System.out.println(animal.toUpperCase());
//        }
//        //Delete ArrayList element
//        animals.remove("Cat");
//        for (String animal : animals) {
//            System.out.println(animal.toUpperCase());
//        }
//        Search ArrayList element
       if (animals.contains("aan")) {
           System.out.println("Sheep is a sheep");
       }else {
           System.out.println("Sheep is not a sheep");
       }
        //Search index
//        System.out.println(animals.indexOf("Dog"));
//    int num = 2;
//        Integer num1 = num;
//        System.out.println(num1.toString()+3);
    }
}
