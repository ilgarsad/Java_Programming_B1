package day36_inheritance.app;

public class C1_App { // App is a Object

    String name;
    double version;

    public C1_App(String name, double version){
        this.name = name;
        this.version = version;
    }

    public void download(){
        System.out.println(name + " is downloading version " + version);
    }

}

/*
Create an App class

    - create variables:
        name (app name), version

    - create constructor to initialize the variables

    - create method:
        download()
            Example output: prints $name is downloading version $version

 */