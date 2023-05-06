package day33_a_static;

import day30_b_custom_classes.C16_Coffee;

import java.util.Arrays;

public class C7_LoopAcademyStudent {

    public String name;
    public int groupNumber;

    C16_Coffee myCoffee;

    public static int batchNumber;
    public static String[] instructors;
    public static String schoolName;

    // you can assign and declare at the same time, but it is not recommended, we will use static block to assign
    static {
        batchNumber = 26;
        instructors = new String[]{"Nadir", "Feyruz", "James", "Gina", "Diana"};
        schoolName = "LoopAcademyStudent";
        printInfo();
    }

    public C7_LoopAcademyStudent(String name, int groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
    }

    public static void printInfo(){
        System.out.println("School Name: " + schoolName);
        System.out.println("Batch Number " + batchNumber);
        System.out.println("Instructors " + Arrays.toString(instructors));
    }


    public String toString() {
        return "LoopAcademyStudent{" +
                "name='" + name + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
