package day34_c_inheritance.person;

public class C17_Building {
    public static void main(String[] args) {

        C15_Person obj = new C15_Person();
        obj.name = "James Bond";
        obj.age = 40;
        obj.favoriteHobby = "spy stuff";
        obj.talk();
        //obj.study(); this was a method made in the child class

        C16_Student obj2 = new C16_Student();
        obj2.name = "Jorge";
        obj2.age = 10;
        obj2.favoriteHobby = "drawing";
        obj2.talk();
        // the above variables and methods were inherited from the Person class

        obj2.funLevel = 100;
        obj2.study();

    }
}
