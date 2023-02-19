package day05_variables;

public class School {

    /*
     Task:
        class name: School
        declare and assign these variables
            number of students in grade 1
            number of students in grade 2
            number of students in grade 3
            number of students in grade 4
            number of students in grade 5
            - > total number of students in your school
            number of days in a year (have some half day = ~ 100.5)
            number of snow days in a year (double)
            average gpa in school (3.5) [ranges 1.0 - 4.0]
            print all of the variables with unique messages
     */

    public static void main(String[] args) {

        int grade1 = 40, grade2 = 30, grade3 = 35, grade4 = 50, grade5 = 44,
                total = grade1 + grade2 + grade3 + grade4 + grade5;

        double numberOfDaysInAYear = 100.5;
        double numberOfSnowDays = 5.5;
        double averageGpaInSchool = 3.5;

        System.out.println("Number of students in Grade 1 = " + grade1);
        System.out.println("Number of students in Grade 1 = " + grade2);
        System.out.println("Number of students in Grade 1 = " + grade3);
        System.out.println("Number of students in Grade 1 = " + grade4);
        System.out.println("Number of students in Grade 1 = " + grade5);
        System.out.println("\nTotal number of students = " + total);

        System.out.println("\nNumber of days in year = " + numberOfDaysInAYear);
        System.out.println("Number of snow days = " + numberOfSnowDays);
        System.out.println("Average GPA in School = " + averageGpaInSchool);


    }
}
