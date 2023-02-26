package day04_variables;

public class PrimitiveDataTypes {

    public static void main(String [] args) {

        byte age = 60;

        System.out.println("60");  //hard coded
        System.out.println(age);    //dynamic

        System.out.println(age);
        System.out.println(age);


        byte age2 = 70;
        byte ageTwo = 80;

        System.out.println(age2);
        System.out.println(ageTwo);

        age =40;
        System.out.println(age);

        //byte number = 200;  //200 is too big for byte type

        short year;             //declare a variable called year and it's data type is short
        year = 2023;            //assigning 2023 to a variable called year

        int addressNumber = 244999944;      //declare a variable called addressNumber and data type is int - assign value of 244999944


        //long bigNumber = 165165498465184 --> this value is int by default. it is too big and need assign it long data type
        long bigNumber = 165165498465184L; //We can add L at the end of the value


    }
}
