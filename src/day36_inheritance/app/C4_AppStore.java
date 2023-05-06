package day36_inheritance.app;

import day36_inheritance.app.C2_Instagram;
import day36_inheritance.app.C3_Youtube;

public class C4_AppStore {
    public static void main(String[] args) {

        C2_Instagram obj1 = new C2_Instagram(3.2);
        obj1.download();
        obj1.postPicture();

        C3_Youtube obj2 = new C3_Youtube(1.4);
        obj2.download();
        obj2.watchVideo();

    }
}

