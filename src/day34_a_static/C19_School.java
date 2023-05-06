package day34_a_static;

public class C19_School {
    public static void main(String[] args) {

        // creat an object that has to parameters: name, groupNum
        C18_LoopAcademyStudent student1 = new C18_LoopAcademyStudent("Javid", 1);
        C18_LoopAcademyStudent student2 = new C18_LoopAcademyStudent("Natalia", 2);


        System.out.println("----------");
        C18_LoopAcademyStudent.printInfo();
        System.out.println("----------");
        C18_LoopAcademyStudent.printInfo();


        System.out.println("----------");
        System.out.println(student1);
        System.out.println(student2);


    }

}