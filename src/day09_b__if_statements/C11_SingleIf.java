package day09_b__if_statements;

public class C11_SingleIf {

    public static void main(String[] args) {

        //if condition is true print out "Today is java day"

        if(true) {

            System.out.println("Today is Java day");

        }
        //System.out.println("Today is Java day");

        //max number of days in Feb is 28
        int maxNumberOfDay = 28;
        if(maxNumberOfDay ==28) {
            System.out.println("This month is February");
        }

        maxNumberOfDay = 30;

        if(maxNumberOfDay ==28) {
            System.out.println("This month is February");
        }

        int quizResult = 50;
        int passGrade = 65;
        if(quizResult >= passGrade) {
            System.out.println("Passed the exam");
        }

        if (quizResult < passGrade) {
            System.out.println("Failing the exam");
        }

        int year = 2021;

        // if year is equal or bigger than 2020 AND less than or equal to 2022 --- it is true
        boolean isCovidYears = year >= 2020 && year <= 2022;

        if(!isCovidYears) {
            System.out.println("It was a Covid Year");



        }

    }
}
