package day36_inheritance.app;

import day36_inheritance.app.C1_App;

public class C3_Youtube extends C1_App {

    public C3_Youtube(double version){
        super("Youtube", version);
    }

    public void watchVideo(){
        System.out.println("Watching java tutorial");
    }

}

/*
Create a class Youtube

    - Youtube class inherits App class

    - create constructor to call parent constructor and set up variables (name and version)

    - create method:
        watchVideo()
            Example output: prints Watching java tutorial
 */
