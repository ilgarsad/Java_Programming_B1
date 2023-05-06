package day05_variables;

public class C4_CharExamples {

    public static void main(String[] args) {

        //assign characters to char type

        char letterOne = 'a';
        char letterTwo = 'Z';
        char numberOne ='9';
        char specialOne = '$';

        int number = 9;

        System.out.println(numberOne + number);

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);

        System.out.println(letterOne + letterTwo);
        //Anything before String is equation
        System.out.println(letterOne + letterTwo + " <---   String  ---> " + letterOne + letterTwo);

        System.out.println();
        //Anything after Stirng is Concatenation
        System.out.println(" <---   String  ---> " + letterOne + letterTwo + " <---   String  ---> " + letterOne + letterTwo);


        char letterThree = 65;

        System.out.println("\n" + letterThree);

        //This is invalid because there is two character.
//        char letterFour = '65';

    }
}
