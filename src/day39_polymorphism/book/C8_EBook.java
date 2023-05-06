package day39_polymorphism.book;

/*
Create an abstract class EBook
    - Inherits Book and implements Downloadable
    - Declare a size variable
    - Declare an abstract methods:
        open()
 */
public abstract class C8_EBook extends C6_Book implements C7_Downloadable {

    int size;

    //    public abstract void open();
    public  void open(){
        System.out.println("Turn On");
    }

}