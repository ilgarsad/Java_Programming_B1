package day40_exception;

public class C8_PersonObject {
    public static void main( String [] args) {
        C7_Person p = new C7_Person();

        try {
            p.setName(null);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }


        System.out.println(p.getName());
        System.out.println(p.getAge());
    }


}
