package day33_a_static;

public class C8_School {
    public static void main(String[] args) {


        C7_LoopAcademyStudent emre = new C7_LoopAcademyStudent("Emre", 5);
        System.out.println(emre);

        System.out.println();
        C7_LoopAcademyStudent.printInfo();

        System.out.println();
        emre.printInfo();

        System.out.println();

        System.out.println(C7_LoopAcademyStudent.instructors[0]);

        System.out.println();
        for(String each : C7_LoopAcademyStudent.instructors){
            System.out.println(each);
        }

    }
}