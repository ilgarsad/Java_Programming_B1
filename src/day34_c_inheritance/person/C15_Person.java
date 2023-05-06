package day34_c_inheritance.person;

public class C15_Person {

    String name;
    int age;
    String favoriteHobby;

    public void talk(){
        System.out.println(name + " is talking");
    }

}


/*

    Person is the Super class

        name, age, favorite hobby

        talk()

    Student class it the sub class of Person

        int fun Level

        study()

 */