package day30_b_custom_classes;

public class C11_UsingApp {
    public static void main(String[] args) {

        C10_App course = new C10_App();
        // name
        //name = "loopcamp";
        course.name = "loopcamp";
        // version
        course.version = 1.1;
        // isFree
        course.isFree = false;
        // run
        // update
        System.out.println(course.name);
        System.out.println(course.version);
        System.out.println(course.isFree);
        course.run(); //
        course.update();

        System.out.println("-------------");
        C10_App social = new C10_App();
        // name
        //System.out.println(social.name);  // null
        //System.out.println(social.version);  // 0.0
        social.name = "Facebook";
        // version
        social.version = 21.3;
        // isFree
        social.isFree = true;
        // run
        // update
        System.out.println(social.name);
        System.out.println(social.version);
        System.out.println(social.isFree);
        social.run();
        social.update();


        System.out.println("-------------");

        System.out.println(course.version);
        System.out.println(social.version);

        System.out.println("-------------");
        new C10_App().run();  // We created a new object ot App class and directly called the method call run(). Since that object has not assigned any data to instance variable "name", that is why it is printing the default data/value which is null

    }

}
