package day36_inheritance.app;

import day36_inheritance.app.C1_App;

public class C2_Instagram extends C1_App {

    public C2_Instagram(double version){
        super("Instagram", version);
    }

    public void postPicture(){
        System.out.println("Posting picture to Instagram");
    }

}
/*
Create a class Instagram

    - Instagram class inherits App class

    - create constructor to call parent constructor and set up variables (name and version)

    - create method:
        postPicture()
            Example output: prints Posting picture to Instagram
 */


/*

Why not do this:
    public Instagram(String name, double version){
        super(name, version);
    }

    new Instagram("instagram", 2.1);

    new Instagram("instagram", 3.4);

    new Instagram("instagram" 4.2);

    if you had to put the type for the String

    new String("string", "value")

 */
