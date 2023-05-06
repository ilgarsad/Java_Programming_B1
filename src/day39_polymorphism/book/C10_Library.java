package day39_polymorphism.book;

import day38_a_abstraction.animal.C1_Animal;

// Runner Class
public class C10_Library {
    public static void main(String[] args) {

        // Reference itself
        C9_JavaTextBook b1 = new C9_JavaTextBook();
        b1.name = "Java Programming";
        b1.size = 30;
        b1.fun = true;
        b1.read();
        b1.open();
        b1.downloadable();
        System.out.println("--------");


        // Reference is Super Class
        C8_EBook b2 = new C9_JavaTextBook();
        b2.name = "Java Programming2";
        b2.size = 40;
        // Since reference is super class we canNOT access child class instance
        //b2.fun = false;
        ( (C9_JavaTextBook)     b2   )          .fun = false;
        b2.read();
        b2.open();
        b2.downloadable();
        System.out.println();

        // Reference is BOOK
        C6_Book b3 = new C9_JavaTextBook();
        b3.name = "Java Programming3";
        // Since reference is super class we canNOT access child class instance
        //b3.size = 50;
        //b3.fun = false;



        // Reference is Interface
        C7_Downloadable b4 = new C9_JavaTextBook();
        // Since reference is INTERFACE we canNOT access child class instance
        //b4.name = "Java Programming4";
        //b4.size = 60;
        //b4.fun = false;
        b4.downloadable();
        // Since reference is INTERFACE we canNOT access child class instance
        //b4.read();
        //b4.open();


        //JavaTextBook b6 = (Animal)b4;
        //Downcasting
        C9_JavaTextBook b5 = (C9_JavaTextBook) b4;
        // b4 was the interface reference, we cast the reference to be a JavaTExtBook (which is a child/small class) and assign it to the b5 reference


        b5.name = "Tes";
        b5.size = 77;
        b5.fun = true;
        b5.open();
        b5.read();
        b5.downloadable();








        System.out.println("------------------------");
        System.out.println(b1 instanceof C9_JavaTextBook);
        System.out.println(b2 instanceof C9_JavaTextBook);
        System.out.println(b2 instanceof C8_EBook);
        System.out.println(b4 instanceof C9_JavaTextBook);
        System.out.println(b4 instanceof C6_Book);
        System.out.println(b4 instanceof C1_Animal);





    }



}

/*
    For the accessibility -  the reference side is taken into consideration.

    For the execution - the object side is taken into consideration
        1. If the method is OVERRIDEN, the execution will take on that overriden method.

        2. If the method is NOT OVERRIDEN, the execution will take the parent class method.

 */